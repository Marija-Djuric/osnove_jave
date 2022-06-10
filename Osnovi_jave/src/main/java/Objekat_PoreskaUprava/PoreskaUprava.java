package Objekat_PoreskaUprava;

import java.util.ArrayList;

public class PoreskaUprava {
    private String imeGrada;
    private ArrayList<Objekat> objekti = new ArrayList<>();

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public String getImeGrada() {
        return imeGrada;
    }

    public void setImeGrada(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public ArrayList<Objekat> getObjekti() {
        return objekti;
    }

    public void setObjekti(ArrayList<Objekat> objekti) {
        this.objekti = objekti;
    }

    public void dodajObjekat (Objekat noviObjekat) {
        objekti.add(noviObjekat);
    }
    public double ukupanPorez () {
        double suma=0;
        for (int i = 0; i < objekti.size(); i++) {
            suma=suma+objekti.get(i).porez();
        } return suma;
    }
    public void stampa () {
        for (int i = 0; i < objekti.size(); i++) {
            objekti.get(i).stampa();
        }
        System.out.println("Ukupan porez "+ukupanPorez());
    }
 //   public Objekat najveciPorez () {

 //   }
}
