package d30_05_2022;

import java.util.ArrayList;

public class Student {
    private int brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList <Ispit> ispiti = new ArrayList<>();

    public Student() {
    }

    public Student(int brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
    public void dodajIspit (Ispit ispit) {
        ispiti.add(ispit);
    }
    public double prosek () {
        int suma=0;
        int brojac=0;
        double prosek=0;
        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).ispitPolozen()){
            suma=suma+ispiti.get(i).getOcena();
            brojac=brojac+1;
            prosek= 1.0*suma/brojac;

} }return prosek;}
    public void stampa ()  {
        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).stampa();
        }
        System.out.println("Prosecna ocena je: "+prosek());
        System.out.println();
    }
}