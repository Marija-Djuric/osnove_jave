package Sektor_radnik_menadzer_magacioner;

import java.util.ArrayList;

public abstract class Radnik {
    protected String imeIPrezime;
    ArrayList <Sektor> sektori = new ArrayList<>();

    public Radnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ArrayList<Sektor> getSektori() {
        return sektori;
    }

    public void setSektori(ArrayList<Sektor> sektori) {
        this.sektori = sektori;
    }

    public abstract double plataRadnika ();
    public void zaposliSeUSektor (Sektor sektorNovi) {
        sektori.add(sektorNovi);
    }

}
