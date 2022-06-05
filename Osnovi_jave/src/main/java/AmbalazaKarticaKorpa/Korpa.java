package AmbalazaKarticaKorpa;

import java.util.ArrayList;

public class Korpa {

    ArrayList<Ambalaza>ambalaze=new ArrayList<>();
    public Korpa() {
    }

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }

    public void setAmbalaze(ArrayList<Ambalaza> ambalaze) {
        this.ambalaze = ambalaze;
    }

    public void dodajAmbalazu(Ambalaza a) {
        this.ambalaze.add(a);
    }
    public void izbaciAmbalazu (String barkod1) {
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if (barkod1.equals(this.ambalaze.get(i).barkod)) {
                this.ambalaze.remove(i);
            }
        }
    }
    public double cenaSaPopustom (double popust) {
        double cenaUkupna=0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            cenaUkupna=cenaUkupna+this.ambalaze.get(i).cenaArtikla();
        } return cenaUkupna-popust;
    }
    public double ukupnaCenaKorpe (SuperKartica uzmiPopust) {
        double cenaUkupna=0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            cenaUkupna=cenaUkupna+this.ambalaze.get(i).cenaArtikla();
        } return cenaUkupna- uzmiPopust.getPopust();
    }
    }

