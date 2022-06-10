package Objekat_PoreskaUprava;

public class MainObjektPoreskaUprava {
    public static void main(String[] args) {

        PoreskaUprava jedna = new PoreskaUprava("Kragujevac");
        Kuca prvi = new Kuca("Vuka Karadzaca 36",100, 2,4);
        Zgrada drugi = new Zgrada("Lole Ribara", 345, 1, 22);
        Lokal treci = new Lokal("Jovana Jovanovic", 234,3);

        jedna.dodajObjekat(prvi);

        jedna.dodajObjekat(drugi);

        jedna.dodajObjekat(treci);

        jedna.stampa();
    }


}
