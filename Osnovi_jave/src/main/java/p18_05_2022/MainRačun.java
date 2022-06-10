package p18_05_2022;

import java.util.Scanner;

public class MainRačun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Račun j = new Račun();
        j. brojRačuna = "37187117674676734646";
        j. imeIPrezime = "Jovan Jovanović";
        j. stanjeRačuna = 13131.232;

        System.out.println("Broj računa je: " + j.brojRačuna);
        System.out.println("Ime i prezime je: "+ j.imeIPrezime);
        System.out.println("Stanje računa je: "+ j.stanjeRačuna);

        Račun n = new Račun ();
        n. brojRačuna = "483290489849283";
        n. imeIPrezime = "Nikola Jovanović";
        n. stanjeRačuna = 122131.232;

        System.out.println("Broj računa je: " + n.brojRačuna);
        System.out.println("Ime i prezime je: "+ n.imeIPrezime);
        System.out.println("Stanje računa je: "+ n.stanjeRačuna);

        System.out.println("Pošaljilac: " + j.imeIPrezime + j.brojRačuna + ", stanje:" + j.stanjeRačuna);
        System.out.println("Primalac: "+ n.imeIPrezime + n.brojRačuna + ", stanje:" + n.stanjeRačuna);

        System.out.println("Unesite sumu za transakciju: ");
        double x = s.nextDouble();
        j.stanjeRačuna= j.stanjeRačuna-x;
        n.stanjeRačuna=n.stanjeRačuna+x;

        System.out.println("Pošaljilac: " + j.imeIPrezime + j.brojRačuna + ", stanje:" + j.stanjeRačuna);
        System.out.println("Primalac: "+ n.imeIPrezime + n.brojRačuna + ", stanje:" + n.stanjeRačuna);
    }
}
