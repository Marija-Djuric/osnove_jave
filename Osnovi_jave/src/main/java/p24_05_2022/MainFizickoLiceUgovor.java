package p24_05_2022;

public class MainFizickoLiceUgovor {
    public static void main(String[] args) {
        FizickoLice prodavac = new FizickoLice("Milos Milosevic","362642648237623", 37357);

        FizickoLice kupac = new FizickoLice("Jovan Jovanovic","4375434654324", 3857293);

        Ugovor novi = new Ugovor("23.04.2022.", 27272, "Vuka Karadzica 56");

        novi.setKupujeNekretninu(kupac);
        novi.setProdajeNekretniku(prodavac);
        novi.stampa();

    }
}
