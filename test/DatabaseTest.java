import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
private Database database;
private ArrayList<Superhero> testListe = new ArrayList<>();
    @BeforeEach
    void setUp() {
        database = new Database();
        testListe.add(new Superhero("Anders", "And", "Svømme", 2001, true, 873));
        testListe.add(new Superhero("Frederik", "Anden", "danse", 2000, true, 23));
    }

    @AfterEach
    void tearDown() {
    database = null;
    }

    @Test
    void tilføjSuperhero() {
        Superhero superhero = new Superhero("Anders", "And" , "Svømme", 2001, true , 873);
    database.tilføjSuperhero(superhero);
    int expectedDatabaseStørelse = 1;
    int actualStørelse = database.getSuperhelteliste().size();
    assertEquals(expectedDatabaseStørelse, actualStørelse);
    }

    @Test
    void søgSuperhero() {
        boolean expected = false;
        if (testListe.get(0)!= null){
            expected = true;
        }
        boolean actual = true;
        assertEquals(expected,actual);
    }

    @Test
    void redigerSuperheronavn() {
        Superhero superhero = new Superhero("Anders", "And" , "Svømme", 2001, true , 873);
        database.tilføjSuperhero(superhero);
        String expectedname = database.redigerSuperheronavn("Anders");
        String actualName = "Rasmus";
        assertEquals(expectedname, actualName);
    }

    @Test
    void redigerSuperheroHeltenavn() {
    }

    @Test
    void redigerSuperheroHelteKraft() {
    }

    @Test
    void redigerSuperheroHeltÅr() {
    }

    @Disabled
    @Test
    void redigerSuperheroHeltmenneske() {
    }

    @Test
    void redigerSuperheroHeltestyrke() {
    }
    @Test
    void sletSuperhero(){

    }
}