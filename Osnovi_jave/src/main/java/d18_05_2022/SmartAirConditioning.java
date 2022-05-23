package d18_05_2022;

public class SmartAirConditioning {
    //Kreirati klasu SmartAirConditioning koja ima:
    //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
    //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
    //atribut za mod (hladi/greje)
    //metodu za stampu - stampa u formatu: Proizvoljno :)
    //U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih
    // pozvati metodu za stampu
    public String markaKlime;
    public int izabranaTemperatura;
    public boolean mod;

    public void metodaZaŠtampu () {

        System.out.println("Klima marke: "+markaKlime+", podešena temperatura: "+izabranaTemperatura+"" +" C.");
        if (mod) {
            System.out.println("Hladi.");
        } else {
            System.out.println("Greje.");
        }
        System.out.println();
    }
}