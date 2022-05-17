package p16_05_2022;

public class Zadatak8 {
    public static void main(String[] args) {
        boolean x = pravougli(1,2,3);
        System.out.println("Da li je trougao pravougli? " + x);
    }
    static boolean pravougli (int a, int b, int c) {
        if (c*c==a*a+b*b) {
            return true;
        } else {
            return false;
        }
    }
}
