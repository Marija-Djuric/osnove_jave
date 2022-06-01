package d30_05_2022;

import java.util.ArrayList;

public class Kombinacija {
    private String id;
    private int prvi;
    private int drugi;
    private int treci;
    private int cetvrti;
    private int peti;
    private int sesti;
    private int sedmi;

    private ArrayList<Integer> nizBrojeva = new ArrayList<>();

    public Kombinacija(String id, int prvi, int drugi, int treci, int cetvrti, int peti, int sesti, int sedmi) {
        this.id = id;
        this.nizBrojeva.add(prvi);
        this.nizBrojeva.add(drugi);
        this.nizBrojeva.add(treci);
        this.nizBrojeva.add(cetvrti);
        this.nizBrojeva.add(peti);
        this.nizBrojeva.add(sesti);
        this.nizBrojeva.add(sedmi);
    }

    public String getId() {
        return id;
    }

    public int getPrvi() {
        return prvi;
    }

    public int getDrugi() {
        return drugi;
    }

    public int getTreci() {
        return treci;
    }

    public int getCetvrti() {
        return cetvrti;
    }

    public int getPeti() {
        return peti;
    }

    public int getSesti() {
        return sesti;
    }

    public int getSedmi() {
        return sedmi;
    }

    public ArrayList<Integer> getNizBrojeva() {
        return nizBrojeva;
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        int brojac=0;
        for (int i = 0; i < nizBrojeva.size(); i++) {
            if (nizBrojeva.get(i)==k.nizBrojeva.get(i)) {
                brojac++;
            }
        } return brojac==7;
    }
    public void stampa () {
        System.out.println("ID: "+id);
        System.out.print("Brojevi: ");
        for (int i = 0; i < nizBrojeva.size(); i++) {
            System.out.print(nizBrojeva.get(i));
        }
        System.out.println();
    }
}
