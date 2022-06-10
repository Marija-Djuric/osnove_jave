package p30_05_2022;

import java.util.ArrayList;

public class InstagramImage {
    private ArrayList <InstagramTag> tagovi = new ArrayList<>();
    private  String dimenzija;
    private String putanja;

    public ArrayList<InstagramTag> getTagovi() {
        return tagovi;
    }

    public String getDimenzija() {

        return dimenzija;
    }

    public String getPutanja() {
        return putanja;
    }

    public void dodajTag (InstagramTag user) {
        tagovi.add(user);
    }

    public InstagramImage(String dimenzija, String putanja) {
        this.dimenzija = dimenzija;
        this.putanja = putanja;
    }
    public  void stampa () {
        System.out.println(dimenzija + " i " + putanja);
        System.out.println("Tagovani: ");
        for (int i = 0; i < tagovi.size(); i++) {
            System.out.println(tagovi.get(i).getUser().getimeIPrezime());
        }
        System.out.println();
    }
}
