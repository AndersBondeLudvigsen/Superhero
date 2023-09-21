import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<Superhero> superheroListe;
    Scanner keyboard = new Scanner(System.in);

    public Database() {
        superheroListe = new ArrayList<>();
    }

    public void tilføjSuperhero(Superhero superhero) {
        superheroListe.add(superhero);
    }


    public ArrayList<Superhero> getSuperhelteliste() {
        return superheroListe;
    }

    public ArrayList<Superhero> søgSuperhero(String brugervalg) {
        ArrayList<Superhero> matchingSuperheroes = new ArrayList<>();


        for (Superhero superhero : superheroListe) {
            if (superhero.getNavn().toLowerCase().contains(brugervalg.toLowerCase())) {
                matchingSuperheroes.add(superhero);
            }
        }

        return matchingSuperheroes;
    }

    public String redigerSuperheronavn(String navn) {
        String newName = " ";
        for (Superhero superhero : superheroListe) {
            if (navn.equals(superhero.getNavn())) {
                System.out.println("Hvad er din superhelts rigtige navn?");
                newName = keyboard.nextLine();
                superhero.setNavn(keyboard.nextLine());
            }

        }
        return newName;
    }

    public void redigerSuperheroHeltenavn(String navn) {
        for (Superhero superhero : superheroListe) {
            if (navn.equals(superhero.getNavn())) {
                System.out.println("Hvad er din superhelts superheltsnavn?");
                keyboard.nextLine();
                superhero.setSuperheroNavn(keyboard.nextLine());
            }
        }
    }

    public void redigerSuperheroHelteKraft(String navn) {
        for (Superhero superhero : superheroListe) {
            if (navn.equals(superhero.getNavn())) {
                System.out.println("Hvad er din superhelts superkraft?");
                keyboard.nextLine();
                superhero.setSuperpower(keyboard.nextLine());
            }
        }
    }

    public void redigerSuperheroHeltÅr(String navn) {
        for (Superhero superhero : superheroListe) {
            if (navn.equals(superhero.getNavn())) {
                System.out.println("Hvornår er din superhelt fra?");
                superhero.setOprindelse(getIntInput());
            }
        }
    }

    public void redigerSuperheroHeltmenneske(String navn) {
        for (Superhero superhero : superheroListe) {
            if (navn.equals(superhero.getNavn())) {
                System.out.println("Er din superhelt et menneske (true/false)?");
                superhero.setMenneske(keyboard.nextBoolean());
            }
        }
    }

    public void redigerSuperheroHeltestyrke(String navn) {
        for (Superhero superhero : superheroListe) {
            if (navn.equals(superhero.getNavn())) {
                System.out.println("Hvor stærk er din superhelt fra 1-1000?");
                superhero.setStyrke(getIntInput());
            }
        }
    }

    public void sletSuperhero() {

        String brugervalg = keyboard.nextLine().toLowerCase();
        ArrayList<Superhero> matchSuperhero = søgSuperhero(brugervalg);

        if (!matchSuperhero.isEmpty()) {
            System.out.println("Disse superhelte er fundet");
            for (int i = 0; i < matchSuperhero.size(); i++) {
                Superhero superhero = matchSuperhero.get(i);
                System.out.println(i + "." + superhero.getNavn());
            }
            System.out.println("Enter the number of the superhero you want to remove: ");
            int superheroDelete = keyboard.nextInt();
            keyboard.nextLine();
            for (int i = 0; i < superheroListe.size(); i++) {
                System.out.println(superheroListe.get(superheroDelete));
                superheroListe.remove(superheroDelete);
            }

        }


    }


    public int getIntInput() {
        while (true) {
            try {
                return keyboard.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println(" ugyldigt input skriv et heltal");
                keyboard.nextLine();
            }
        }
    }

    public boolean getBooleanInput() {
        while (true) {
            try {
                boolean input = keyboard.nextBoolean();
                return input;
            } catch (Exception e) {
                System.out.println("ugyldigt input, skriv true/false");
                keyboard.nextLine();
            }
        }
    }
}




