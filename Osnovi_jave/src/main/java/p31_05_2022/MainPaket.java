package p31_05_2022;

public class MainPaket {
    public static void main(String[] args) {
        EonPaket prvi = new EonPaket("Jovan Jovanovic", 1999.9, 24);
        DuoPaket drugi = new DuoPaket("Milos Milosevic",2499.9,12, "tablet");

  //
        prvi.stampa();

        drugi.povecanjeBrzine(10,20);
        drugi.stampa();

    }
}
