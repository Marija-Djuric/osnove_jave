package d16_05_2022;

public class Zadatak1 {
    //Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.Iz
    // main-a pozvati izvrsenje metode za razlicite vrednosti.
    public static void main(String[] args) {
        vrednostBroja(4);
    }
    static void  vrednostBroja (int x) {
        int stampajVrednostZa10Vecu = x + 10;
        System.out.println("Nova vrednost je: " + stampajVrednostZa10Vecu);
    }
}
