package p31_05_2022;

public class EonPaket extends Paket{

    public EonPaket(String korisnik, double mesecnaCena, int ugovornaObaveza) {
        super("EON LIGHT DUO", korisnik, mesecnaCena, ugovornaObaveza,
                150, 75);
    }
    @Override
    public int meseciZaDinar () {
        return 3;
    }
    @Override
    public void stampa () {
        super.stampa();
        System.out.println(" + "+meseciZaDinar());
        System.out.println();
    }
}
