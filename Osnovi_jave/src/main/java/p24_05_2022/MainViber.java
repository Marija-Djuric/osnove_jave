package p24_05_2022;

public class MainViber {
    public static void main(String[] args) {
        ViberKorisnik poslao = new ViberKorisnik("Jovan Jovanovic",
                                                 060545454,
                                                 true);
        ViberKorisnik primio = new ViberKorisnik("Milos Milosevic",
                                                 0603435454,
                                                 false);
        ViberReakcija smajli = new ViberReakcija(":)");
        smajli.setKorisnik(primio);
        ViberPoruka prva = new ViberPoruka("Zdravo!","12.12.2020");
        prva.setPoslao(poslao);
        prva.setPrimio(primio);
        prva.setReakcija(smajli);
        prva.prikazi();
    }
}
