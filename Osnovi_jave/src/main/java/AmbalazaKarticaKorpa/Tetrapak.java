package AmbalazaKarticaKorpa;

public class Tetrapak extends Ambalaza{
    private boolean recikliranje;
    private double osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina,
                    boolean recikliranje, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.recikliranje = recikliranje;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isRecikliranje() {
        return recikliranje;
    }

    public void setRecikliranje(boolean recikliranje) {
        this.recikliranje = recikliranje;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.recikliranje) {
            return this.tezinaPakovanja()*1.5+this.osnovnaCena;
        } else {
        return this.osnovnaCena;
    }  }

    @Override
    public void stampa() {
        System.out.println("Barkod artikla je:"+this.barkod);
        System.out.println("Naziv artikla je: "+this.nazivArtikla);
        System.out.println("Neto tezina: "+this.netoTezina);
        System.out.println("Bruro tezina: "+this.brutoTezina);
        if (this.recikliranje) {
            System.out.println("Moze se reciklirati.");
        } else {
            System.out.println("Ne moze se reciklirati.");
        }
        System.out.println("Cena artikla je "+this.cenaArtikla());
        System.out.println();
    }
}
