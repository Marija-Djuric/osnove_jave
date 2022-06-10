package PlaninaPlaninar;

public abstract class Planinar {
    protected int identifikacioniBroj;
    protected String imeIPrezime;

    public Planinar(int identifikacioniBroj, String imeIPrezime) {
        this.identifikacioniBroj = identifikacioniBroj;
        this.imeIPrezime = imeIPrezime;
    }

    public int getIdentifikacioniBroj() {
        return identifikacioniBroj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public abstract void stampa ();
    public abstract int clanarina ();
    public abstract boolean uspesanUspon(Planina p);
}
