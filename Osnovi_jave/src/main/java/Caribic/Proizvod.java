package Caribic;

import java.util.ArrayList;

public abstract class Proizvod {
    protected ArrayList <Dodatak> dodaci = new ArrayList<>();
    public Proizvod() {
    }

    public ArrayList<Dodatak> getDodaci() {
        return dodaci;
    }




    public void ubaciDodatak (Dodatak dodatakNovi) {
        dodaci.add(dodatakNovi);
    }
    public int cenaDodataka () {
        int cenaUkupna=0;
        for (int i = 0; i < dodaci.size(); i++) {
            cenaUkupna=cenaUkupna+dodaci.get(i).getCena();
        }return cenaUkupna;
    }
    public abstract int ukupnaCena ();
    public abstract void stampa();
}
