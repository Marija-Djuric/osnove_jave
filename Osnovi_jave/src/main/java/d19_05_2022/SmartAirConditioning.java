package d19_05_2022;

public class SmartAirConditioning {
    //(ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
    //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
    //atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
    //atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
    //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
    //atribut za mod (hladi/greje)
    //metodu za stampu - stampa u formatu
    //marka - mod - termperatura
    //metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
    //30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
    //metodu koja racuna koliko klima novca potrosi za mesec dana
    //Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
    //Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
    //Metoda vraca ukupnu cenu za taj mesec
    //
    //U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.
    String marka;
    public int potrošnjaDokGreje;
    public int potrošnjaDokHladi;
    public int izabranaTemperatura;
    public String mod;
    public void štampa (){
        System.out.println(marka+" - "+mod+" - "+izabranaTemperatura);}
    public int mesečnaPotrošnja () {
        if (this.mod.equals("Hladi.")) {
            return 30*15*this.potrošnjaDokHladi;
        } return 30*15*this.potrošnjaDokGreje;
    }
    public int ukupnaCena () {
        if (this.mesečnaPotrošnja()<350) {
            return this.mesečnaPotrošnja()*6;
        } return 350*6+(this.mesečnaPotrošnja()-350)*9;
    }
}
