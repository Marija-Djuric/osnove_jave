package p20_05_2022;

import d30_05_2022.Kombinacija;
import d30_05_2022.Listic;

public class MainKombinacijaListic {
    public static void main(String[] args) {
        Kombinacija prva = new Kombinacija("A1",2,11,23,26,34,35,39);
        Kombinacija druga = new Kombinacija("A2",3,12,18,23,27,33,35);
        Kombinacija treca = new Kombinacija("A3",6,13,22,28,29,33,37);
        Kombinacija cetvrta = new Kombinacija("A4",8,11,16,28,29,31,34);
        Kombinacija peta = new Kombinacija("A5",9,12,18,26,28,30,36);
        Kombinacija sesta = new Kombinacija("A6",7, 9,14, 17,23,26,34);
        Kombinacija sedma = new Kombinacija("A7",1,7,14,19,27,29,31);
        Kombinacija osma = new Kombinacija("A8",3,14,16,23,27,28,33);

        Kombinacija dobitnaKombinacija = new Kombinacija("A5",9,12,18,26,28,30,36);
        Listic dobitni = new Listic();
        dobitni.dodajKombinaciju(prva);
        dobitni.dodajKombinaciju(druga);
        dobitni.dodajKombinaciju(treca);
        dobitni.dodajKombinaciju(cetvrta);
        dobitni.dodajKombinaciju(peta);
        dobitni.dodajKombinaciju(sesta);
        dobitni.dodajKombinaciju(sedma);

        Listic nedobitni = new Listic();
        nedobitni.dodajKombinaciju(prva);
        nedobitni.dodajKombinaciju(druga);
        nedobitni.dodajKombinaciju(treca);
        nedobitni.dodajKombinaciju(cetvrta);
        nedobitni.dodajKombinaciju(sesta);
        nedobitni.dodajKombinaciju(sedma);
        nedobitni.dodajKombinaciju(osma);


        if (dobitni.dobitna(dobitnaKombinacija)) {
            System.out.println("Listic je dobitan.");
        }
        System.out.println("Listic nije dobitan.");

        dobitni.stampa();
        }
    }

