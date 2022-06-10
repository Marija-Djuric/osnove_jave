package p31_05_2022;

public class Osoba {
    protected String imeIPrezime;
    protected String jmbg;

    public Osoba(String imeIPrezime, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
    }
    public void stampa ()  {
        System.out.println(imeIPrezime+", "+jmbg);
    }
}
