package p16_05_2022;

public class Zadatak9 {
    public static void main(String[] args) {
        int z = broj("X");
        System.out.println(z);


    }
    static int broj ( String x) {
        if (x.equals("|")) {
            return 1;
        } else  if (x.equals("||")) {
            return 2;
        } else  if (x.equals("|||")) {
            return 3;
        } else  if (x.equals("|V")) {
            return 4;
        } else  if (x.equals("V")) {
            return  5;
        } else  if (x.equals("V|")) {
            return  6;
        } else  if (x.equals("V||")) {
            return 7;
        } else  if (x.equals("V|||")) {
            return 8;
        } else  if (x.equals("|X")) {
            return  9;
        } else  if (x.equals("X")) {
            return  10;
        } else {
            return 0;
        }
    }
}
