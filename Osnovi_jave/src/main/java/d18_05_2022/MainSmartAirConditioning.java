package d18_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {

        SmartAirConditioning objekat1 = new SmartAirConditioning();
        objekat1.markaKlime = "Samsung";
        objekat1.izabranaTemperatura = 16;
        objekat1.mod = true;

        SmartAirConditioning objekat2 = new SmartAirConditioning();
        objekat2.markaKlime = "Galanz";
        objekat2.izabranaTemperatura = 25;
        objekat2.mod = false;

        SmartAirConditioning objekat3 = new SmartAirConditioning();
        objekat3.markaKlime = "Gree";
        objekat3.izabranaTemperatura = 18;
        objekat3.mod = true;

        objekat1.metodaZaŠtampu();
        objekat2.metodaZaŠtampu();
        objekat3.metodaZaŠtampu();
    }
}
