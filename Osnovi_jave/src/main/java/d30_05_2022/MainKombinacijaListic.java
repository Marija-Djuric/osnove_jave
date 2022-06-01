package d30_05_2022;

public class MainKombinacijaListic {
    public static void main(String[] args) {
        Kombinacija prva = new Kombinacija("A1",4,8,12,19,28,29,35 );
        Kombinacija druga = new Kombinacija("A2",2,7,14,21,25,31,36);
        Kombinacija treca = new Kombinacija("A3",5,8,9,15,19,22,33);
        Kombinacija cetvrta = new Kombinacija("A4",7,9,15,17,25,27,30);
        Kombinacija peta = new Kombinacija("A5", 2,5,14,15,17,22,34);
        Kombinacija sesta = new Kombinacija("A6", 12,14,22,23,27,33,34);
        Kombinacija sedma = new Kombinacija("A7", 10,13,21,25,31,33,37);
        Kombinacija osma = new Kombinacija("A8", 2,13,17,18,26,28,31);
        Kombinacija deveta = new Kombinacija("A9", 8,14, 24, 26, 27, 31, 39);
        Kombinacija dobitnaKombinacija = new Kombinacija("A10",8,14, 24, 26, 27, 31, 39);

        Listic nijeDobitan = new Listic();
        nijeDobitan.dodajKombinaciju(prva);
        nijeDobitan.dodajKombinaciju(druga);
        nijeDobitan.dodajKombinaciju(treca);
        nijeDobitan.dodajKombinaciju(cetvrta);
        nijeDobitan.dodajKombinaciju(peta);
        nijeDobitan.dodajKombinaciju(sesta);
        nijeDobitan.dodajKombinaciju(sedma);

        Listic dobitan = new Listic();
        dobitan.dodajKombinaciju(prva);
        dobitan.dodajKombinaciju(druga);
        dobitan.dodajKombinaciju(treca);
        dobitan.dodajKombinaciju(cetvrta);
        dobitan.dodajKombinaciju(peta);
        dobitan.dodajKombinaciju(osma);
        dobitan.dodajKombinaciju(deveta);

        dobitan.stampa();
        if (dobitan.dobitna(dobitnaKombinacija)) {
            System.out.println("Listic je dobitan");
        } else {
            System.out.println("Listic nije dobitan");
        }
        System.out.println();
        nijeDobitan.stampa();
        if (nijeDobitan.dobitna(dobitnaKombinacija)) {
            System.out.println("Listic je dobitan");
        } else {
            System.out.println("Listic nije dobitan");
        }
        }
    }

