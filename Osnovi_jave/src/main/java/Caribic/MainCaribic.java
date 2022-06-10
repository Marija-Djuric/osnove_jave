package Caribic;

import java.util.ArrayList;

public class MainCaribic {
    public static void main(String[] args) {
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
        IcePoint sladoled3 = new IcePoint("jagoda", false);
        Pica pizza1 = new Pica(300);
        Pica pizza2 = new Pica(200);

        ArrayList <Proizvod> jedan = new ArrayList<>();
        jedan.add(sladoled1);
        jedan.add(sladoled2);
        jedan.add(sladoled3);
        jedan.add(pizza1);
        jedan.add(pizza2);



        sladoled1.ubaciDodatak(plazma);
        sladoled2.ubaciDodatak(prelivJagoda);
        sladoled3.ubaciDodatak(prelivMalina);
        sladoled3.ubaciDodatak(cokolada);
        pizza1.ubaciDodatak(kecap);
        pizza1.ubaciDodatak(majonez);
        pizza2.ubaciDodatak(pavlaka);
        pizza2.ubaciDodatak(masline);

        int cenaNarudzbine=0;
        for (int i = 0; i < jedan.size(); i++) {
            cenaNarudzbine=cenaNarudzbine+jedan.get(i).ukupnaCena();
        }

        for (int i = 0; i < jedan.size(); i++) {
            jedan.get(i).stampa();
            System.out.println();
        }
        System.out.println("Cena narudzbine je "+cenaNarudzbine);
        }
    }

