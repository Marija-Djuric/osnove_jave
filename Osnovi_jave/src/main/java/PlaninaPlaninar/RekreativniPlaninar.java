package PlaninaPlaninar;

public class RekreativniPlaninar extends Planinar{

    private int tezinaOpreme;
    private String okrug;
    private int maksimalniUspon;

    public RekreativniPlaninar(int identifikacioniBroj, String imeIPrezime, int tezinaOpreme,
                               String okrug, int maksimalniUspon) {
        super(identifikacioniBroj, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maksimalniUspon = maksimalniUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public int getMaksimalniUspon() {
        return maksimalniUspon;
    }

    @Override
    public void stampa() {
        System.out.println("Rekreativac, id: "+identifikacioniBroj);
        System.out.println("Ime: "+imeIPrezime);
        System.out.println("Okrug: "+okrug);
        System.out.println();
    }

    @Override
    public int clanarina() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if (maksimalniUspon-tezinaOpreme*50 >= p.getVisina()) {
        return true;
        }       return false;
}
}