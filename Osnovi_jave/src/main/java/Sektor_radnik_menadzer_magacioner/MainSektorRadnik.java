package Sektor_radnik_menadzer_magacioner;

public class MainSektorRadnik {
    //Kreirati klasu Sektor koja ima:
    // naziv sektora
    // platu koja je za taj sektor
    //
    //Kreirati abstraktnu klasu Radnik koja ima:
    // ime i prezime
    // niz sektora u kojima radi
    // abstraktnu metodu koja vraca platu radnika
    // metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
    //
    //Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
    // override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
    //
    //Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
    // ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
    // suma plata svih sektor / broj sektora * 0.5
    // override uje metodu za platu, tako da se plata racuna po formuli:
    //(prosecna plata za sve sektore u kojima radi) * (broj sektora).
    //
    //U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u
    // kojima rade i ispisati platu za svakog
    public static void main(String[] args) {
        Magacioner jedan = new Magacioner("Milos Milosevic");
        Menadzer prvi = new Menadzer("Jovan Jovanovic");
        Sektor proizvodnja = new Sektor("proizvodnja", 40000.0);
        Sektor logistika = new Sektor("logistika", 60000.0);

        jedan.zaposliSeUSektor(proizvodnja);
        prvi.zaposliSeUSektor(logistika);

        System.out.println(jedan.getImeIPrezime()+" ima platu "+proizvodnja.getPlata());
        System.out.println(prvi.getImeIPrezime()+" ima platu "+logistika.getPlata());
        }
    }

