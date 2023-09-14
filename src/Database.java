import java.util.ArrayList;
import java.util.List;
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

    public List<Superhero> søgSuperhero(String brugervalg) {
        List<Superhero> matchingSuperheroes = new ArrayList<>();


        for (Superhero superhero : superheroListe) {
            if (superhero.getNavn().toLowerCase().contains(brugervalg.toLowerCase())) {
                matchingSuperheroes.add(superhero);
            }
        }

        return matchingSuperheroes;
    }

    public void redigerSuperheronavn(String navn) {
        for (Superhero superhero : superheroListe) {
            if (navn.equals(superhero.getNavn())) {
                System.out.println("Hvad er din superhelts rigtige navn?");
                superhero.setNavn(keyboard.nextLine());
            }
            }
        }
    public void redigerSuperheroHeltenavn(String navn){
        for (Superhero superhero : superheroListe){
            if (navn.equals(superhero.getNavn())){
                System.out.println("Hvad er din superhelts superheltsnavn?");
                superhero.setSuperheroNavn(keyboard.nextLine());
            }
        }
    }
    public void redigerSuperheroHelteKraft(String navn){
        for (Superhero superhero : superheroListe){
            if (navn.equals(superhero.getNavn())){
                System.out.println("Hvad er din superhelts superkraft?");
                superhero.getSuperpower(keyboard.nextLine());
            }
        }
    }
    public void redigerSuperheroHeltÅr(String navn){
        for (Superhero superhero : superheroListe){
            if (navn.equals(superhero.getNavn())){
                System.out.println("Hvornår er din superhelt fra?");
                superhero.setOprindelse(keyboard.nextInt());
            }
        }
    }
    public void redigerSuperheroHeltmenneske(String navn){
        for (Superhero superhero : superheroListe){
            if (navn.equals(superhero.getNavn())){
                System.out.println("Er din superhelt et menneske (true/false)?");
                superhero.setMenneske(keyboard.nextBoolean());
            }
        }
    }
    public void redigerSuperheroHeltestyrke(String navn){
        for (Superhero superhero : superheroListe){
            if (navn.equals(superhero.getNavn())){
                System.out.println("Hvor stærk er din superhelt fra 1-1000?");
                superhero.setStyrke(keyboard.nextInt());
            }
        }
    }


}




