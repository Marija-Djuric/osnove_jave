package KartonOsobaIgrac;

public class MainKartonOsobaIgrac {
    public static void main(String[] args) {
        Karton prvi = new Karton("zuti");
        Karton drugi = new Karton("zuti");
        Karton treci = new Karton("zuti");
        Karton cetvrti = new Karton("crveni");
        Karton peti = new Karton("crveni");

        Igrac jedan = new Igrac("Jovan Jovanovic","4364329649636736",
                1997,11,"napad",true);

        jedan.dodajKarton(prvi);
        jedan.dodajKarton(drugi);
        jedan.dodajKarton(treci);
        jedan.dodajKarton(cetvrti);
        jedan.dodajKarton(peti);

        jedan.stampa();
    }
}
