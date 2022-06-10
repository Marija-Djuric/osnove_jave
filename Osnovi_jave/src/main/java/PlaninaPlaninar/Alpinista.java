package PlaninaPlaninar;

public class Alpinista extends Planinar{
    private int ostvareniPoeni;

    public Alpinista(int identifikacioniBroj, String imeIPrezime, int ostvareniPoeni) {
        super(identifikacioniBroj, imeIPrezime);
        this.ostvareniPoeni = ostvareniPoeni;
    }

    public int getOstvareniPoeni() {
        return ostvareniPoeni;
    }

    public void setOstvareniPoeni(int ostvareniPoeni) {
        this.ostvareniPoeni = ostvareniPoeni;
    }

    @Override
    public void stampa() {
        System.out.println("Alpinista: "+identifikacioniBroj);
        System.out.println("Ime: "+imeIPrezime);
        System.out.println("Broj poena: "+ostvareniPoeni);
        System.out.println();
    }

    @Override
    public int clanarina() {
        return 1500-ostvareniPoeni*50;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if (p.getVisina() < 4000) {
        return true;
    } return false;
}  }
