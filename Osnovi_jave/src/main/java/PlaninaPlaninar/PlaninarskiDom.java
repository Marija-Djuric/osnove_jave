package PlaninaPlaninar;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar>planinari=new ArrayList<>();

    public PlaninarskiDom() {
    }

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;

    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void setPlaninari(ArrayList<Planinar> planinari) {
        this.planinari = planinari;
    }
    public void uclaniPlaninara (Planinar planinar) {
        planinari.add(planinar);
    }
    public int uspešnoSePopeli (Planina planina) {
        int brojac=0;
        for (int i = 0; i < planinari.size(); i++) {
            if (planinari.get(i).uspesanUspon(planina)) {
                brojac++;
            }

        } return brojac;
    }
    public void izbaciPlaninara (int id) {
        for (int i = 0; i < planinari.size(); i++) {
            if (id==planinari.get(i).getIdentifikacioniBroj()) {
                planinari.remove(i);
            }
        }
    }
    public void stampa ()  {
        System.out.println("Naziv doma je "+nazivDoma);
        System.out.println("Godina osnivanja je "+godinaOsnivanja);
        System.out.println("Planinari su: ");
        for (int i = 0; i < planinari.size(); i++) {
            planinari.get(i).stampa();
        }
    }
    public int mesecniPrihodOdClanarina () {
        int suma=0;
        for (int i = 0; i < planinari.size(); i++) {
            suma=suma+planinari.get(i).clanarina();
        }return suma;
    }
}
