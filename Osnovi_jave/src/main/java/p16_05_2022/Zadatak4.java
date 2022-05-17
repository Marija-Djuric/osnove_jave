package p16_05_2022;

public class Zadatak4 {
    public static void main(String[] args) {
        operacija(2,4);
        operacija(11, 1);
        operacija(3, 3);
    }
    static void operacija(int a,int b) {
        System.out.println("Zbir je: "+(a+b));
        System.out.println("Razlika je: "+(a-b));
        System.out.println("Proizvod je: "+a*b);
        System.out.println("Količnik je: "+a/b);
        System.out.println();
}}
