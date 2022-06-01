package Osoba_igrac_trener;

public class Trener extends Osoba {
    private int godineIskustva;
    private String tipTrenera;

    public Trener() {
    }

    public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva,
                  String tipTrenera) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampa () {
        super.stampa();
        System.out.println("Godine iskustva: "+godineIskustva);
        System.out.println("Tip trenera: "+tipTrenera);
        System.out.println();
    }
}
