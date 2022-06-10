package p23_05_2022;

public class MainClKartaKupacProizvod {
    public static void main(String[] args) {
        Kartica prva = new Kartica(10, "36765737367367364");

        Kupac kupac = new Kupac (prva);
        kupac.setImeIPrezime("Jovan Jovanovic");

        Proizvod neki = new Proizvod();
        neki.setNaziv("lopta");
        neki.setCenaIzrade(234);
        neki.setKupac(kupac);
        neki.stampa();
    }
    }



