package p30_05_2022;

import java.util.ArrayList;

public class InstagramPost {
    private ArrayList <InstagramImage> slike = new ArrayList<>();
    private  String opis;

    public InstagramPost( String opis) {
        this.opis = opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public void dodajSliku (InstagramImage InstagramImage) {
        slike.add(InstagramImage);
    }
    public void stampa () {
        System.out.println(opis);
        for (int i = 0; i < slike.size(); i++) {


        }
    }
}
