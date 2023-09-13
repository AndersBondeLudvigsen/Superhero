import java.util.ArrayList;

public class Controller {
    private Database db;

    public Controller(Database db) {
        this.db = db;
    }

    public ArrayList<Superhero> getSuperhelteListe() {
        return db.getSuperhelteliste();
    }

    public void tilføjSuperhero(String navn, String superheltNavn, String superPower, int oprindelse, boolean menneske, int styrke) {

    }
}
