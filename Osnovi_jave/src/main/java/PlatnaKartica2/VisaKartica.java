package PlatnaKartica2;

public class VisaKartica extends PlatnaKartica{
    private String ovlascenoLice;

    public VisaKartica(double suma, String brojKartice, String godina, String mesec, String ovlascenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlascenoLice=ovlascenoLice;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
    @Override
    public void izvrsiTransakciju (double transakcija)  {
        double provizija=transakcija*1000/18;
        suma=suma-transakcija-provizija;
    }
    public void stampa ()   {
        System.out.print("Visa Card: ");
        System.out.println(brojKartice+", "+mesec+"/"+godina+", $"+suma);
        System.out.println();
    }
}

