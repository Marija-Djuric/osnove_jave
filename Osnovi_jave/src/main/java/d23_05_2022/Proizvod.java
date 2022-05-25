package d23_05_2022;

public class Proizvod {
    private int sifra;
    private String naziv;
    private double cenaKg;

    public Proizvod(int sifra, String naziv, double cenaKg) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaKg = cenaKg;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaKg(double cenaKg) {
        this.cenaKg = cenaKg;
    }

    public double getCenaKg() {
        return cenaKg;
    }
    public double getCenaLb () {
        return cenaKg/2.2046;
    }
    public void stampa () {
        System.out.println(sifra+" - "+naziv);
    }
}
