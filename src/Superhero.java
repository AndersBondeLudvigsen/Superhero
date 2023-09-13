public class Superhero {
    //Atributter
    private String navn;
    private String superheroNavn;
    private String superpower;
    private int oprindelse;
    private boolean menneske;
    private int styrke;


    //konstruktør metode
    public Superhero(String navn, String superheroNavn, String superPower, int oprindelse, boolean menneske, int styrke) {
        this.navn = navn;
        this.superheroNavn = superheroNavn;
        this.superpower = superPower;
        this.oprindelse = oprindelse;
        this.menneske = menneske;
        this.styrke = styrke;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "navn='" + navn + '\'' +
                ", superheroNavn='" + superheroNavn + '\'' +
                ", superpower='" + superpower + '\'' +
                ", oprindelse=" + oprindelse +
                ", menneske='" + menneske + '\'' +
                ", styrke=" + styrke +
                '}';
    }
}
