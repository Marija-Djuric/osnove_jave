package PlatnaKartica2;

public class MasterKartica extends PlatnaKartica {
    public MasterKartica(double suma, String brojKartice, String godina, String mesec) {
        super(suma, brojKartice, godina, mesec);
    }
    @Override
    public void izvrsiTransakciju (double transakcija)  {
        double provizija=transakcija*1000/15;
        suma=suma-transakcija-provizija;
    }
    public void naplatiOdrzavanje ()  {
        suma=suma-2;
    }
    public void stampa ()  {
        System.out.println("Master card: "+mesec+"/"+godina+", "+brojKartice+", $"+suma);
        System.out.println();
    }
}


