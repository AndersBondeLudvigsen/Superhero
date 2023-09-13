import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private Controller controller;

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    void run() {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Superhero> superheroList = new ArrayList<>();


        System.out.println("For at oprette superhelte tast (1)");
        System.out.println("For at se dine superhelte tast (2)");
        System.out.println("For at afslutte tast (9)");

        int choice = keyboard.nextInt();
        if (choice == 1) {
            addFiveHeroes(superheroList);
            printSuperheroes(superheroList);
        } else if (choice == 2) {
            printSuperheroes(superheroList);
        }
    }

    void addFiveHeroes(List<Superhero> superheroList) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hvor mange superhelte vil du oprette?");
        int numberOfHeroes = keyboard.nextInt();
        keyboard.nextLine();

        for (int i = 0; i < numberOfHeroes; i++) {
            System.out.println("Hvad er din superhelts rigtige navn?");
            String realName = keyboard.nextLine();
            System.out.println("Hvad er din superhelts superheltsnavn?");
            String superheroName = keyboard.nextLine();
            System.out.println("Hvad er din superhelts superkraft?");
            String superpower = keyboard.nextLine();
            System.out.println("Hvilket år er din superhelt fra?");
            int year = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Er din superhelt et menneske (true/false)?");
            boolean isHuman = keyboard.nextBoolean();
            System.out.println("Hvor stærk er din superhelt fra 1-1000?");
            int strength = keyboard.nextInt();

            Superhero superhero = new Superhero(realName, superheroName, superpower, year, isHuman, strength);
            superheroList.add(superhero);
        }
    }

    void printSuperheroes(List<Superhero> superheroList) {
        System.out.println("List of Superheroes:");
        for (Superhero superhero : superheroList) {
            System.out.println(superhero.toString());
        }
    }
}