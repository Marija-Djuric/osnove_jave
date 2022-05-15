package d13_05_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {
    //Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5. Niz je
    // fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
    //Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad,
    // ispod, sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje, vodite racuna da ne
    // izadjete van opsega niza). Za racunanje sume, nije potrebna petlja!
    //U projektu kreirati paket za ovaj domaci d13_05_2022 i u njemu klasu Zadatak1.java i postavite
    // tekst zadataka u komentaru a zatim commit-ujte promenu i push-ujte na github sa porukom
    // “Domaci 13.05.2022 Zadatak 1”
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Random random = new Random();
        Scanner s = new Scanner(System.in);

        for (int i =0; i<25; i++) {
            int x = random.nextInt(10);
            niz.add(x);
        }
        for (int i=0; i<niz.size(); i++) {
            System.out.print(niz.get(i) + ",");
            if (i%5==4) {
                System.out.println();
            }}
        System.out.println("Unesite poziciju: ");
        int pozicija = s.nextInt();
        int gornji = 0;
        int donji = 0;
        int levo = 0;
        int desno = 0;

        if (pozicija-5>=0) {
            gornji=niz.get(pozicija-5);
        }

        if (pozicija+5<=24) {
            donji =niz.get(pozicija + 5);
        }

        if (pozicija%5!=0) {
            levo =niz.get(pozicija - 1);
        }

        if (pozicija%5!=4) {
            desno =niz.get(pozicija + 1);
        }

        int suma = niz.get(pozicija)+ gornji + donji + levo + desno;
        System.out.println("Suma je: " + suma);
        }
    }

