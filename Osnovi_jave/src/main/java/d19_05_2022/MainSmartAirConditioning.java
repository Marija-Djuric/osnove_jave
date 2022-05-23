package d19_05_2022;

import java.sql.SQLOutput;

public class MainSmartAirConditioning {
    public static void main(String[] args) {
        SmartAirConditioning prvi = new SmartAirConditioning();
        prvi.marka="Samsung";
        prvi.potrošnjaDokGreje=1;
        prvi.potrošnjaDokHladi=2;
        prvi.izabranaTemperatura=17;
        prvi.mod="Hladi";

        prvi.štampa();
        System.out.println("Mesečna potrošnja je: "+prvi.mesečnaPotrošnja());
        System.out.println("Potrošeno novca za mesec dana: "+prvi.ukupnaCena());
        System.out.println();

        SmartAirConditioning drugi = new SmartAirConditioning();
        drugi.marka="Galanz";
        drugi.potrošnjaDokGreje=3;
        drugi.potrošnjaDokHladi=4;
        drugi.izabranaTemperatura=24;
        drugi.mod="Greje";

        drugi.štampa();
        System.out.println("Mesečna potrošnja je: "+drugi.mesečnaPotrošnja());
        System.out.println("Potrošeno novca za mesec dana: "+drugi.ukupnaCena());
}}
