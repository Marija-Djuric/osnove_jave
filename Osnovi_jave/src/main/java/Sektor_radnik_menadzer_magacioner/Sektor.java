package Sektor_radnik_menadzer_magacioner;

public class Sektor {
    protected String nazivSektora;
    protected Double plata;

    public Sektor(String nazivSektora, Double plata) {
        this.nazivSektora = nazivSektora;
        this.plata = plata;
    }

    public String getNazivSektora() {
        return nazivSektora;
    }

    public Double getPlata() {
        return plata;
    }
}
