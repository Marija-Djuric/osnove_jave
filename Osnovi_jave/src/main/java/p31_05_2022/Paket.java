package p31_05_2022;

public class Paket {
    protected String naziv;
    protected String korisnik;
    protected double mesecnaCena;
    protected int ugovornaObaveza;
    protected int brzinaDownload;
    protected int brzinaUpload;

    public Paket(String naziv, String korisnik, double mesecnaCena, int ugovornaObaveza,
                 int brzinaDownload, int brzinaUpload) {
        this.naziv = naziv;
        this.korisnik = korisnik;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
        this.brzinaDownload = brzinaDownload;
        this.brzinaUpload = brzinaUpload;
    }
    public void produziUgovor ()  {
        ugovornaObaveza=ugovornaObaveza+12;
    }
    public int meseciZaDinar () {
        return 0;
    }
    public void stampa () {
        System.out.println(korisnik);
        System.out.println(naziv+" - "+brzinaDownload+"/"+brzinaUpload+" - "+ugovornaObaveza);
        System.out.print(mesecnaCena);
    }}