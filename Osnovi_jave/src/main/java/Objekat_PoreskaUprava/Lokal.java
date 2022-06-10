package Objekat_PoreskaUprava;

public class Lokal extends Objekat{

    public Lokal(String adresa, double površina, int zona) {
        super(adresa, površina, zona);
    }

    @Override
    public double porez() {
        return koeficijent()*površina*1.3;
    }

    @Override
    public void stampa() {
        System.out.println("Aredesa: "+adresa);
        System.out.println("Povrsina: "+površina);
        System.out.println("Zona: "+zona);
        System.out.println("Porez:"+porez());
    }
}
