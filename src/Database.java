import java.util.ArrayList;
import java.util.List;

public class Database {
    private ArrayList<Superhero> superheroListe;


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
}

