package Objekat_PoreskaUprava;

public class Kuca extends Objekat{

    private int brojClanova;

    public Kuca(String adresa, double površina, int zona, int brojClanova) {
        super(adresa, površina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double porez() {
        return koeficijent()*površina;
    }

    @Override
    public void stampa() {
        System.out.println("Aredesa: "+adresa);
        System.out.println("Povrsina: "+površina);
        System.out.println("Zona: "+zona);
        System.out.println("Broj clanova je: "+brojClanova);
        System.out.println("Porez je: "+porez());
    }
}
