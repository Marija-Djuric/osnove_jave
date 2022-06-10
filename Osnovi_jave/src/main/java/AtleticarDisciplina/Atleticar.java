package AtleticarDisciplina;

public abstract class Atleticar {
    private String imeIPrezime;
    protected double rezultat;

    public Atleticar() {
    }

    public Atleticar(String imeIPrezime, double rezultat) {
        this.imeIPrezime = imeIPrezime;
        this.rezultat = rezultat;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }

    public abstract boolean bolji (Atleticar atleticar);

    public void stampa () {
        System.out.println("Ime i prezime: "+imeIPrezime);
        System.out.println("Rezultat je: "+rezultat);
    }
}
