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
    public Superhero(){

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
    public String getNavn(){
        return navn;
    }
    public void setNavn(String navn){
        this.navn=navn;
    }

    public void setMenneske(boolean menneske) {
        this.menneske = menneske;
    }
    public void setSuperheroNavn(String superheroNavn){
        this.superheroNavn = superheroNavn;
    }

    public void setOprindelse(int oprindelse) {
        this.oprindelse = oprindelse;
    }

    public String getSuperpower(String superpower) {
        return superpower;
    }

    public void setStyrke(int styrke) {
        this.styrke = styrke;
    }
}

