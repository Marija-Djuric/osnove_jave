package Caribic;

public class IcePoint extends Proizvod{
    public IcePoint(String tipSladoleda, boolean mali) {
        this.tipSladoleda = tipSladoleda;
        this.mali = mali;
    }

    private String tipSladoleda;

    private boolean mali;

    @Override
    public int ukupnaCena() {
        if (mali) {
            return cenaDodataka()+100;
        } else  {
            return cenaDodataka()+130;
        }
    }
    @Override
    public void stampa() {
        System.out.println("Tip sladoleda "+tipSladoleda);
        if (mali) {
            System.out.println("Sladoled je mali.");
        } else {
            System.out.println("Sladoled je veliki.");
        }
        for (int i = 0; i < dodaci.size(); i++) {
            dodaci.get(i).stampa();
        }
    }
}
