package Osoba_igrac_trener;

public class Igrač extends Osoba{
    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrač() {
    }

    public Igrač(String imeIPrezime, String jmbg, int godinaRodjenja, int broj,
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
    @Override
    public void  stampa ()  {
        super.stampa();
        System.out.println("Igrac nosi broj: "+broj);
        System.out.println("Igra na poziciji: "+pozicija);
        if (this.kapiten) {
        System.out.println("Igrac je kapiten.");
        } else {
            System.out.println("Igrac nije kapiten.");
        }
        System.out.println();
    }
}
