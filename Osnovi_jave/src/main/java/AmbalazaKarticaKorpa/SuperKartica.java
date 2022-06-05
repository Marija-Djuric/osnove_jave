package AmbalazaKarticaKorpa;

public class SuperKartica {
    private String brojKartice;
    private String vlasnik;
    private double popust;

    public SuperKartica() {
    }

    public SuperKartica(String brojKartice, String vlasnik, int popust) {
        this.brojKartice = brojKartice;
        this.vlasnik = vlasnik;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public void stampa(){
        System.out.println("Broj kartice: "+this.brojKartice);
        System.out.println("Ime i prezime vlasnika je "+this.vlasnik);
    }
}
