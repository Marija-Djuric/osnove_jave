package d16_05_2022;

public class Zadatak2 {
    //2.Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca
    // novu vrednost koja se formira kao na primeru:
    //ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
    //ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
    public static void main(String[] args) {
        String novaVrednost = vrednost(5,2);
        System.out.println("Nova vrednost je: "+novaVrednost);
    }
    static String vrednost (int x, int y) {
        return (x+""+y);
    }
}
