import java.util.ArrayList;

public class Controller {
    private Database db;

    public Controller(Database db) {
        this.db = db;
    }

    public ArrayList<Superhero> getSuperhelteListe() {
        return db.getSuperhelteliste();
    }
}