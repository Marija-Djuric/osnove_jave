package PlatnaKartica2;

public abstract class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected String godina;
    protected String mesec;

    public PlatnaKartica(double suma, String brojKartice, String godina, String mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public String getGodina() {
        return godina;
    }

    public String getMesec() {
        return mesec;
    }
    public void dodajSredstva (double dodataVrednost)  {
        suma=suma+dodataVrednost;

    }
    public abstract void izvrsiTransakciju (double transakcija); // {

    public abstract void stampa ();

}


