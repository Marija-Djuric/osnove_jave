package Caribic;

import d26_05_2022.Sastojak;

import java.util.ArrayList;

public class Kasa {
    private String sastojak1;
    private String sastojak2;
    private String sastojak3;
    private String sastojak4;
    private String sastojak5;
    private String sastojak6;
    private String sastojak7;
    private String sastojak8;
    private String sastojak9;
    private String sastojak10;

    public Kasa(String sastojak1, String sastojak2, String sastojak3, String sastojak4,
                String sastojak5, String sastojak6, String sastojak7, String sastojak8,
                String sastojak9, String sastojak10) {
        this.sastojak1 = sastojak1;
        this.sastojak2 = sastojak2;
        this.sastojak3 = sastojak3;
        this.sastojak4 = sastojak4;
        this.sastojak5 = sastojak5;
        this.sastojak6 = sastojak6;
        this.sastojak7 = sastojak7;
        this.sastojak8 = sastojak8;
        this.sastojak9 = sastojak9;
        this.sastojak10 = sastojak10;
    }

    ArrayList <Dodatak> dostupniDodaci = new ArrayList<>();
    ArrayList <Proizvod> proizvodi = new ArrayList<>();
    public void dodajProizvod (Proizvod proizvodNovi) {
        proizvodi.add(proizvodNovi);
    }
    public Dodatak nadjiDodatak (String nazivDodatka) {
        for (int i = 0; i < dostupniDodaci.size(); i++) {
        if (nazivDodatka.equals(dostupniDodaci.get(i).getNaziv())) {
            return dostupniDodaci.get(i);
        }
    } return null;

}
    public int izracunajCenuPorudzbine () {
       int ukupnaCena1=0;
        for (int i = 0; i < proizvodi.size(); i++) {
            ukupnaCena1=ukupnaCena1+proizvodi.get(i).ukupnaCena();
        }return ukupnaCena1;
    }
    public void stampajRacun () {
        int ukupanRacun=0;
        for (int i = 0; i < proizvodi.size(); i++) {
           ukupanRacun=ukupanRacun+ proizvodi.get(i).ukupnaCena();
        }
        System.out.println("Ukupan Racun je: "+izracunajCenuPorudzbine());
    }
}