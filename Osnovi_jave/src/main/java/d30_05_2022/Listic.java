package d30_05_2022;

import java.util.ArrayList;

public class Listic {

    private ArrayList <Kombinacija> listic = new ArrayList<>();
    public void dodajKombinaciju (Kombinacija k) {
        listic.add(k);
    }
    public ArrayList<Kombinacija> getListic() {
        return listic;
    }

    public boolean dobitna (Kombinacija dobitnaKombinacija) {
        for (int i = 0; i < listic.size(); i++) {
            if (listic.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)){
                return true;
        }
    }return false;
}
    public void stampa ()  {
        for (int i = 0; i < listic.size(); i++) {
            listic.get(i).stampa();
        }
    }
}
