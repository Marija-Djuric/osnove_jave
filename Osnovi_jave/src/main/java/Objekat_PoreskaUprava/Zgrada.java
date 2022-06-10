package Objekat_PoreskaUprava;

public class Zgrada extends Objekat{

    private int brojStanova;

    public Zgrada(String adresa, double površina, int zona, int brojStanova) {
        super(adresa, površina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double porez() {
        return koeficijent()*površina*brojStanova;
    }

    @Override
    public void stampa() {
        System.out.println("Aredesa: "+adresa);
        System.out.println("Povrsina: "+površina);
        System.out.println("Zona: "+zona);
        System.out.println("Broj stanova: "+brojStanova);
        System.out.println("Porez:"+porez());
    }
}
