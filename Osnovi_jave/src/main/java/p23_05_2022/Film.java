package p23_05_2022;

public class Film {
    private String naziv;
    private int godina;
    private Reziser reziser;
    public Film (){}
    public Film ( String naziv, int godina) {
        this.naziv=naziv;
        this.godina=godina;
    }
    public String getNaziv() {
        return this.naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv=naziv;
    }
    public int getGodina(){
        return this.godina;
    }
    public void setGodina(int godina) {
        this.godina=godina;
    }
    public Reziser getReziser () {
        return this.reziser;
    }
    public void setReziser(Reziser reziser) {
        this.reziser=reziser;
    }
    public void stampa () {
      System.out.println("Naziv filma je "+this.naziv+ ", godina izdanja je " +this.godina);
        System.out.println("Rezirao ga je "+this.reziser.getImeIPrezime());
      //  System.out.println("Rezirao ga je ");
      //  this.reziser.stampa();
    }
}
