package AmbalazaKarticaKorpa;

public class StaklenaAmbalaza extends Ambalaza{
    private int kaucija;
    private boolean placaSeKaucija;
    private double osnovnaCena;

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }

    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina,
                            int kaucija, boolean placaSeKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.placaSeKaucija) {
            return this.osnovnaCena*1.2+this.kaucija;
        }else {
        return this.osnovnaCena*1.2;
    }  }

    @Override
    public void stampa() {
            System.out.println("Barkod artikla je:"+this.barkod);
            System.out.println("Naziv artikla je: "+this.nazivArtikla);
            System.out.println("Neto tezina: "+this.netoTezina);
            System.out.println("Bruro tezina: "+this.brutoTezina);
            if (placaSeKaucija) {
                System.out.println("Kaucija je "+this.kaucija);
           } else  {
                System.out.println("Kaucija se ne placa.");
            }
        System.out.println("Cena artikla je "+this.cenaArtikla());
        System.out.println();
    }
}
