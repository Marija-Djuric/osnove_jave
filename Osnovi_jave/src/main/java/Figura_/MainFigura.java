package Figura_;

import java.util.ArrayList;

public class MainFigura {
    public static void main(String[] args) {

        Figura trougao1=new JednakostranicniTrougao(5);
        Figura trougao2=new JednakostranicniTrougao(4);
        Figura pravougaonik1 = new Pravougaonik(5,6);
        Figura pravougaonik2 = new Pravougaonik(3,5);
        Figura pravougaonik3 = new Pravougaonik(6,8);

        ArrayList<Figura> nizFigura = new ArrayList<>();
        nizFigura.add(trougao1);
        nizFigura.add(trougao2);
        nizFigura.add(pravougaonik1);
        nizFigura.add(pravougaonik2);
        nizFigura.add(pravougaonik3);

        double sumaObim=0;
        for (int i = 0; i < nizFigura.size(); i++) {
            sumaObim=sumaObim + nizFigura.get(i).obim();
        }
        System.out.println("Suma obima je: "+sumaObim);

        double sumaPovrsina=0;
        for (int i = 0; i < nizFigura.size(); i++) {
            sumaPovrsina=sumaPovrsina + nizFigura.get(i).povrsina();
        }
        System.out.println("Suma povrsina je: "+sumaPovrsina);

        trougao1.stampa();
        trougao2.stampa();
        pravougaonik1.stampa();
        pravougaonik2.stampa();
        pravougaonik3.stampa();
    }
}
