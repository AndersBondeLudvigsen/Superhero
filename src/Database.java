import java.util.ArrayList;
import java.util.List;

public class Database {
    private ArrayList<Superhero> superheroListe;


    public Database() {
        superheroListe = new ArrayList<>();
    }

    public void tilføjSuperhero(String navn, String superheltNavn, String superPower, int oprindelse, boolean menneske, int styrke) {
        Superhero superhero = new Superhero(navn, superheltNavn, superPower, oprindelse, menneske, styrke);
        superheroListe.add(superhero);
    }

    public ArrayList<Superhero> getSuperhelteliste() {
        return superheroListe;
    }
}



