package d24_05_2022;

public class Transakcija {
    private int id;
    private Racun uplatilac;
    private Racun primalac;

    public Transakcija() {
    }

    public Transakcija(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getUplatilac() {
        return uplatilac;
    }

    public void setUplatilac(Racun uplatilac) {
        this.uplatilac = uplatilac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }
    private double provizija (double transakcija) {
        if (transakcija<4500) {
            return 45;
        }return transakcija/100;
    }
    public void izvrsiTransakciju (double transakcija) {
        if (this.uplatilac.getStanje()>(transakcija+provizija(transakcija))) {
            this.uplatilac.promenaStanja(-transakcija-this.provizija(transakcija));
            this.primalac.promenaStanja(transakcija);
        }
    }
    public  void stampa () {
        System.out.println("ID transakcije je: "+id);
        System.out.println("Racun sa: "+uplatilac.getVlasnik()+" - "+uplatilac.getBroj());
        System.out.println("Racun na: "+primalac.getVlasnik()+" - "+primalac.getBroj());
    }
}
