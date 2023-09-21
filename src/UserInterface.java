import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Controller controller;
    Database database = new Database();

    void run() {
        Scanner keyboard = new Scanner(System.in);
        //ArrayList<Superhero> superheroList = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("For at oprette superhelte tast (1)");
            System.out.println("For at se dine superhelte tast (2)");
            System.out.println("For at søge efter en superhelt tast (3)");
            System.out.println("For at redigere i en oprettet superhelt (4)");
            System.out.println("For at slette en superhero tast (5)");
            System.out.println("For at afslutte tast (9)");

            int choice = database.getIntInput();
            //keyboard.nextLine();

            switch (choice) {
                case 1:
                    addFiveHeroes();
                    break;
                case 2:
                    printSuperheroes(database.getSuperhelteliste());
                    break;
                case 3:
                    System.out.println("Skriv navnet på din superhelt eller noget af navnet");
                    String søgeString = keyboard.nextLine();
                    List<Superhero> matchMellemBrugerogSuperhero = database.søgSuperhero(søgeString);
                    if (!matchMellemBrugerogSuperhero.isEmpty()) {
                        System.out.println("Superhero(s) er fundet:");
                        for (Superhero superhero : matchMellemBrugerogSuperhero) {
                            System.out.println(superhero);
                        }
                    } else {
                        System.out.println("Der blev ikke fundet noget match");
                    }
                    break;
                case 4:

                    System.out.println("Skriv navnet på den superhero du ville redigere");
                    String rediger = keyboard.nextLine();
                    System.out.println("Hvad ville du ændre ved din superhelt?");
                    System.out.println("(1) for rigtige navn");
                    System.out.println("(2) for superheltenavn");
                    System.out.println("(3) for superheltekraft");
                    System.out.println("(4) for at ændre hvor din superhelt er fra");
                    System.out.println("(5) for om det er et menneske eller ej");
                    System.out.println("(6) for at ændre styrken på din superhelt");
                    int ændring = database.getIntInput();

                    if (ændring == 1) {
                        database.redigerSuperheronavn(rediger);
                }
                    if (ændring == 2){
                        database.redigerSuperheroHeltenavn(rediger);
                    }
                    if (ændring == 3){
                        database.redigerSuperheroHelteKraft(rediger);
                    }
                    if (ændring == 4){
                        database.redigerSuperheroHeltÅr(rediger);
                    }
                    if (ændring == 5){
                        database.redigerSuperheroHeltmenneske(rediger);
                    }
                    if (ændring == 6){
                        database.redigerSuperheroHeltestyrke(rediger);
                    }
                    break;
                case 5:
                    database.sletSuperhero();
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
            }
        }
    }

    void addFiveHeroes() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hvor mange superhelte vil du oprette?");
        int numberOfHeroes = database.getIntInput();


        for (int i = 0; i < numberOfHeroes; i++) {
            System.out.println("Hvad er din superhelts rigtige navn?");
            String realName = keyboard.nextLine();
            System.out.println("Hvad er din superhelts superheltsnavn?");
            String superheroName = keyboard.nextLine();
            System.out.println("Hvad er din superhelts superkraft?");
            String superpower = keyboard.nextLine();
            System.out.println("Hvilket år er din superhelt fra?");
            int year = database.getIntInput();
            System.out.println("Er din superhelt et menneske (true/false)?");
            boolean isHuman = database.getBooleanInput();
            System.out.println("Hvor stærk er din superhelt fra 1-1000?");
            int strength = database.getIntInput();


            Superhero superhero = new Superhero(realName, superheroName, superpower, year, isHuman, strength);
            //superheroList.add(superhero);
            database.tilføjSuperhero(superhero);
        }
    }

    void printSuperheroes(List<Superhero> superheroList) {
        System.out.println("List of Superheroes:");
        for (Superhero superhero : superheroList) {
            System.out.println(superhero.toString());
        }
    }


}
