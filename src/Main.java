import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner keyboard = new Scanner(System.in);
        Database superHelteListe = new Database();
        System.out.println("For at oprette superhelte tast (1)");
        System.out.println("For at afslutte tast (9)");
        int choice = keyboard.nextInt();
        if (choice == 1) {
            addFiveHeroes(superHelteListe);
            superHelteListe.printeHelte(); // Skal slettes hvis der kommer print menu
        }
    }

    void addFiveHeroes(Database superHelteListe) {
        IO io = new IO();
        System.out.println("Hvor mange superhelte ville du lave");
        int numberOfHeroes = io.readInt();
        for (int i = 0; i < numberOfHeroes; i++) {
            Scanner keyboard = new Scanner(System.in);
            String name = "";
            String superHeroName = "";
            String specialPower = "";
            int year = 0;
            String isHuman = "";
            int strength = 0;


            System.out.println("Hvad er din superhelts rigtige navn?");
            name = keyboard.nextLine();
            System.out.println("Hvad er din persons superheltsnavn?");
            superHeroName = keyboard.nextLine();
            System.out.println("Hvad er din superhelts superkraft?");
            specialPower = keyboard.nextLine();
            System.out.println("Hvilket år er din superhelt fra");
            year = io.readInt();
            System.out.println("Er din superhelt et menneske (Ja/Nej)?");
            isHuman = keyboard.nextLine();
            System.out.println("Hvor stærk er din superhelt fra 1-1000");
            strength = io.readInt();

            superHelteListe.tilføjSuperhero(name, superHeroName, specialPower, year, isHuman, strength);

        }
    }
}
