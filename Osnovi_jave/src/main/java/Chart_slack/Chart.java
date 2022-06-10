package Chart_slack;

import java.util.ArrayList;

public class Chart {
    private ArrayList<Integer>nizBrojeva=new ArrayList<>();
    private String naslov;

    public void setNizBrojeva(ArrayList<Integer> nizBrojeva) {
        this.nizBrojeva = nizBrojeva;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public ArrayList<Integer> getNizBrojeva() {
        return nizBrojeva;
    }

    public String getNaslov() {
        return naslov;
    }

    public Chart(String naslov) {
        this.naslov = naslov;
    }

    public void dodaj (int broj) {
        nizBrojeva.add(broj);
    }
    public void stampa() {
        int broj=100;
        System.out.print(broj);
        System.out.print("\t");
        for (int i = 0; i < nizBrojeva.size(); i++) {
            if (nizBrojeva.get(i)==100){
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }
        for (int i = 0; i < 10; i++) {
            broj=broj-10;
            System.out.println();
            System.out.print(broj);
            System.out.print("\t");
            for (int j = 0; j < nizBrojeva.size(); j++) {
                if (nizBrojeva.get(j)>broj) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
        }
        }
        System.out.println();
        System.out.println(naslov);
    }
}
