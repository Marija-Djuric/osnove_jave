package d16_05_2022;

public class Zadatak6 {
    //(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom
    // programu iskoristi funkciju i ispisti odgovarajucu poruku.
    public static void main(String[] args) {
        int najmannji = brojevi(155,2633,344);
        System.out.println("Najmanji broj je: " + najmannji);
    }
    static int brojevi (int x, int y, int z) {
        int a=0;
        if (x < y && x < z) {
            a = x;}
            else if (y < x && y < z) {
                a = y;}
                else {
                    a = z;}
                    return a;
            }
        }


