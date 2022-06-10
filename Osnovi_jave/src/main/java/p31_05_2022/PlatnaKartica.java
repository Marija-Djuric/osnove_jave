package p31_05_2022;

public class PlatnaKartica {
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
    public void izvrsiTransakciju (double transakcija)  {
        suma=suma-transakcija;
        if (transakcija>suma) {
            suma=suma;
        }
    }
    public void stampa ()  {
        System.out.println(brojKartice+", "+mesec+"/"+godina+", $"+suma);
    }
}
