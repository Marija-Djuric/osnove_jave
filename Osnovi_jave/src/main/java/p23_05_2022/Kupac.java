package p23_05_2022;

public class Kupac {
    private String imeIPrezime;
    private Kartica kartica;

    public Kupac(Kartica k) {
        this.kartica = k;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Kartica getKartica() {
        return this.kartica;
    }
    public void stampa () {
        System.out.println(this.imeIPrezime+ " - "+ this.kartica.getBrojKartice());
    }
}
