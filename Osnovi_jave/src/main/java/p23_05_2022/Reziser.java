package p23_05_2022;

public class Reziser {
    private String imeIPrezime;
    private int starost;
    public Reziser (){}

    public Reziser (String imeIPrezime, int starost) {
        this.imeIPrezime=imeIPrezime;
        this.starost=starost;
    }
    public String getImeIPrezime( ){
        return this.imeIPrezime;
    }
    public void setImeIPrezime (String imeIPrezime) {
        this.imeIPrezime=imeIPrezime;
    }
    public int getStarost () {
        return this.starost;
    }
    public void setStarost (int starost) {
        this.starost=starost;
    }
    public void stampa () {
        System.out.println("Ime i prezime rezisera je "+this.imeIPrezime+ " i ima godina " +this.starost);
    }
}
