package d24_05_2022;

public class Racun {
    private String broj;
    private String vlasnik;
    private double stanje;

    public Racun() {
    }

    public Racun(String broj, String vlasnik, int stanje) {
        this.broj = broj;
        this.vlasnik = vlasnik;
        this.stanje = stanje;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public double getStanje() {
        return stanje;
    }
    public double promenaStanja (double transakcija) {
        if (stanje+transakcija>0) {
            return stanje+transakcija;
        } return stanje;
    }
    public void stampa () {
        System.out.println(vlasnik+" - "+broj);
        System.out.println("Stanje na racunu je: "+promenaStanja(5000)+" rsd.");
    }
}


