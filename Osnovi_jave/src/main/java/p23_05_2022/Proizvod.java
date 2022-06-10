package p23_05_2022;

public class Proizvod {
    private String naziv;
    private int cenaIzrade;
    private Kupac kupac;

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Kupac getKupac () {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac=kupac;
    }
    public double cenaProizvoda () {
       return this.cenaIzrade*1.9*(100-this.kupac.getKartica().getPupust())/100;
    }
    public void stampa () {
        System.out.println(this.naziv+" - "+this.cenaProizvoda());
        this.kupac.stampa();
    }}

