package p16_05_2022;

public class Zadatak5 {
    public static void main(String[] args) {

        stampajApsolutnuVrednost(-3);
    }
    static void stampajApsolutnuVrednost(int a) {
        if (a>0) {
        System.out.println("Apsolutna vrednost je: " + a);}
        else {
            System.out.println("Apsolutna vrednost je: " + ((-1)*a));
        }
    }
}
