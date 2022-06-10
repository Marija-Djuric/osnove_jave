package p31_05_2022;

public class DuoPaket extends Paket {
    private String uredjaj;
    public DuoPaket(String korisnik, double mesecnaCena, int ugovornaObaveza, String uredjaj) {
        super("EON FULL DUO", korisnik, mesecnaCena, ugovornaObaveza,
                250, 100);
        this.uredjaj=uredjaj;
    }
    @Override
    public int meseciZaDinar () {
        return 6;
    }
    public void povecanjeBrzine (int povecanjeDownload, int povecanjeUpload) {
        brzinaDownload=brzinaDownload+povecanjeDownload;
        brzinaUpload=brzinaUpload+povecanjeUpload;
    }
    @Override
    public void stampa () {
        super.stampa();
        System.out.println(" + "+meseciZaDinar());
        System.out.println();
    }
}
