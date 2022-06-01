package KartonOsobaIgrac;

import java.util.ArrayList;

public class Igrac extends Osoba{

    private int broj;
    private String pozicija;
    private ArrayList<Karton> kartoni=new ArrayList<>();
    private boolean kapiten;

    public ArrayList<Karton> getKartoni() {
        return kartoni;
    }

    public void setKartoni(ArrayList<Karton> kartoni) {
        this.kartoni = kartoni;
    }

    public Igrac() {
    }

    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int broj,
                 String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
    public void dodajKarton (Karton noviKarton)  {
        kartoni.add(noviKarton);
    }
    public int brojZutihKartona ()  {
        int brojac1=0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (kartoni.get(i).getTip().equals("zuti")) {
                brojac1++;
            }
        }return brojac1;
}
    public int brojCrvenihKartona ()  {
        int brojac2=0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (kartoni.get(i).getTip().equals("crveni")) {
                brojac2++;
            }
        }return brojac2;
}@Override
    public void stampa () {
        super.stampa();
        System.out.println("Broj igraca: "+broj);
        System.out.println("Pozicija "+pozicija);
        if (this.kapiten) {
        System.out.println("Igrac je kapiten.");
        } else {
            System.out.println("Igrac nije kapiten.");
        }
        System.out.println("Broj zutih kartona je "+brojZutihKartona());
        System.out.println("Broj crvenih kartona je "+brojCrvenihKartona());
    }
}