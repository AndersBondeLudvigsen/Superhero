public class Database {
    private Superhero[] Superhelteliste;
    int count = 0;

    public Database() {
        this.Superhelteliste = new Superhero[5];
    }

    public void tilføjSuperhero(String navn, String superheltNavn, String superPower, int oprindelse, String ishuman, int styrke) {
        Superhelteliste[count++] = new Superhero(navn, superheltNavn, superPower, oprindelse, ishuman, styrke);
    }

    public void printeHelte() {
        for (Superhero hero : Superhelteliste) {
            System.out.println(hero);
        }
    }

}

