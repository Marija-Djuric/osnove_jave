package Caribic;

public class Main2 {
    public static void main(String[] args) {
        Kasa prva = new Kasa("brasno","luk","jaja","piletina","sos","cokolada","vanila","jagoda","slag","secer");

        Dodatak plazma = new Dodatak("plazma", 20);
        Dodatak cokolada = new Dodatak("cokolada", 30);
        Dodatak prelivJagoda = new Dodatak("preliv od jagode",20);
        Dodatak prelivMalina = new Dodatak("malina", 30);
        Dodatak kecap = new Dodatak("kecap",10);
        Dodatak majonez = new Dodatak("majonez",20);
        Dodatak pavlaka = new Dodatak("pavlaka", 10);
        Dodatak masline = new Dodatak("masline", 40);

        IcePoint sladoled1 = new IcePoint("vanila", true);
        IcePoint sladoled2 = new IcePoint("cokolada",false);
        Pica pizza1 = new Pica(300);
        Pica pizza2 = new Pica(400);

        sladoled1.ubaciDodatak(cokolada);
        sladoled2.ubaciDodatak(prelivJagoda);
        sladoled2.ubaciDodatak(prelivMalina);
        pizza1.ubaciDodatak(kecap);
        pizza2.ubaciDodatak(pavlaka);

        prva.dodajProizvod(sladoled1);
        prva.dodajProizvod(sladoled2);
        prva.dodajProizvod(pizza1);
        prva.dodajProizvod(pizza2);
        prva.stampajRacun();


    }
}
