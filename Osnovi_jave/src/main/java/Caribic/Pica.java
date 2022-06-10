package Caribic;

public class Pica extends Proizvod{
    private int cenaPodloge;

    public Pica(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public int ukupnaCena() {
        return cenaDodataka()+cenaPodloge;
    }

    @Override
    public void stampa() {
        System.out.println("Cena podloge je "+cenaPodloge);
        for (int i = 0; i < dodaci.size(); i++) {
            dodaci.get(i).stampa();
    }
    }
}