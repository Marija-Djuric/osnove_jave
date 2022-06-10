package p31_05_2022;

public class Profesor extends Osoba{
    private String nazivPredmeta;
    private double plata;


    public Profesor(String imeIPrezime, String jmbg, String nazivPredmeta, double plata) {
        super(imeIPrezime, jmbg);
        this.nazivPredmeta=nazivPredmeta;
        this.plata=plata;
    }
    public double povecajPlatu (int procenatPovecanja)  {
        this.plata=this.plata+this.plata/procenatPovecanja;
        return plata;
    }
    @Override
    public void stampa ()  {
        super.stampa();
        System.out.println(nazivPredmeta+", "+plata);
    }
}
