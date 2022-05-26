package d24_05_2022;

public class MainRacunTransakcija {
    public static void main(String[] args) {
        Racun uplatilac = new Racun("234-3336366-12", "Jovan Jovanovic",50000);
        Racun primalac = new Racun("123-352653-23", "Milos Milosevic", 30000);
        uplatilac.stampa();
        primalac.stampa();
        System.out.println();

        Transakcija prva = new Transakcija(250);
        prva.setUplatilac(uplatilac);
        prva.setPrimalac(primalac);
        prva.stampa();
        prva.izvrsiTransakciju(1000);
        prva.stampa();
    }
}
