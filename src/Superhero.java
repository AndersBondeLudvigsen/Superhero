public class Superhero {
    //Atributter
    private String navn;
    private String superheroNavn;
    private String superpower;
    private int oprindelse;
    private String menneske;
    private int styrke;


    //konstruktør metode
    public Superhero(String navn, String superheroNavn, String superPower, int oprindelse, String menneske, int styrke) {
        this.navn = navn;
        this.superheroNavn = superheroNavn;
        this.superpower = superPower;
        this.oprindelse = oprindelse;
        this.menneske = menneske;
        this.styrke = styrke;
    }

    //Getters
    public int getOprindelse() {
        return oprindelse;
    }

    public int getStyrke() {
        return styrke;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "navn='" + navn + '\'' +
                ", superheroNavn='" + superheroNavn + '\'' +
                ", superpower='" + superpower + '\'' +
                ", oprindelse=" + oprindelse +
                ", race='" + menneske + '\'' +
                ", styrke=" + styrke +
                '}';
    }
}
