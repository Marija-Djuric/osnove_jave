package d26_05_2022;

public class MainSastojakPasta {
    public static void main(String[] args) {
        Sastojak prvi = new Sastojak("testenina", 100);
        Sastojak drugi = new Sastojak("paradajz sos", 80);
        Sastojak treci = new Sastojak("mleveno meso", 500);
        Sastojak cetvrti = new Sastojak("luk", 100);
        Sastojak peti = new Sastojak("pavlaka za kuvanje", 250);
        Sastojak sesti = new Sastojak("slanina", 500);

        Pasta bolonjeze = new Pasta();
        bolonjeze.dodavanjeSastojaka(prvi);
        bolonjeze.dodavanjeSastojaka(drugi);
        bolonjeze.dodavanjeSastojaka(treci);
        bolonjeze.dodavanjeSastojaka(cetvrti);
        bolonjeze.stampa();

        Pasta carbonara = new Pasta();
        carbonara.dodavanjeSastojaka(prvi);
        carbonara.dodavanjeSastojaka(cetvrti);
        carbonara.dodavanjeSastojaka(peti);
        carbonara.dodavanjeSastojaka(sesti);
        carbonara.dodavanjeSastojaka(drugi);
        carbonara.brisanjeSastojaka(drugi);
        carbonara.stampa();
    }
}
