package Objekat_PoreskaUprava;

public abstract class Objekat {
    protected String adresa;
    protected double površina;
    protected int zona;

    public Objekat(String adresa, double površina, int zona) {
        this.adresa = adresa;
        this.površina = površina;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovršina() {
        return površina;
    }

    public void setPovršina(double površina) {
        this.površina = površina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }
    public double koeficijent () {
        if (zona==1) {
            return 1.4;
        }
        else if (zona==2)  {
            return 1.1;
        }
        else  {
            return 1.05;
        }
    }
    public abstract double porez ();
    public abstract void stampa ();
}
