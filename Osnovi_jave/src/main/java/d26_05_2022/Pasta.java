package d26_05_2022;

import java.util.ArrayList;

public class Pasta {
      private  ArrayList<Sastojak> pasta = new ArrayList<Sastojak>();


        public void dodavanjeSastojaka (Sastojak sastojak) {
            pasta.add(sastojak);
            }
    public Pasta() {
    }
    public void brisanjeSastojaka (Sastojak sastojak) {
            for (int i=0; i<this.pasta.size();i++) {
                if (this.pasta.get(i).equals(sastojak)) {
                    this.pasta.remove(i);
                }
            }
    }
    public double cenaPaste () {
            double cenaPaste=0;
            for (int i=0; i<pasta.size(); i++) {
                cenaPaste=cenaPaste+this.pasta.get(i).getCena();
            }
            return  cenaPaste;
    }
    public void stampa ( ) {
        System.out.println("Pasta je sa sastojcima: ");
       for (int i=0; i<this.pasta.size(); i++)  {
           System.out.println(this.pasta.get(i).getNaziv()+" - "+this.pasta.get(i).getCena()); }
        System.out.println("Cena paste je "+cenaPaste()+" din.");
        System.out.println();
    }
}



