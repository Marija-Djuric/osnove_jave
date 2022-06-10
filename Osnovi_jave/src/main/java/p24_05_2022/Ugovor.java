package p24_05_2022;

public class Ugovor {
    private String datumSklapanja;
    private FizickoLice prodajeNekretniku;
    private FizickoLice kupujeNekretninu;
    private int cena;
    private String adresa;

    public Ugovor(String datumSklapanja, int cena, String adresa) {
        this.datumSklapanja = datumSklapanja;
        this.cena = cena;
        this.adresa = adresa;
    }
    public double procenatZarade () {
        if (kupujeNekretninu.isVećKupovao()==true) {
            return 0.02;
        }return 0.03;
    }

    public void setProdajeNekretniku(FizickoLice prodajeNekretniku) {
        this.prodajeNekretniku = prodajeNekretniku;
    }

    public void setKupujeNekretninu(FizickoLice kupujeNekretninu) {
        this.kupujeNekretninu = kupujeNekretninu;
    }

    public FizickoLice getProdajeNekretniku() {
        return prodajeNekretniku;
    }

    public FizickoLice getKupujeNekretninu() {
        return kupujeNekretninu;
    }

    public double zaradaAgencije () {
        return 1000+cena*procenatZarade();
    }
    public void stampa () {
        System.out.print("Dana "+datumSklapanja+" god sklopljen je ugovor izmedju ");
        this.prodajeNekretniku.stampa();
        System.out.print( "i ");
        this.kupujeNekretninu.stampa();
        System.out.print(" o kupovini nekretnine "+adresa+" po ceni od ");
        System.out.print(cena+"  pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od ");
        System.out.println(zaradaAgencije());
    }
}
