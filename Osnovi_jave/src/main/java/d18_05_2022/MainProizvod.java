package d18_05_2022;

public class MainProizvod {
    public static void main(String[] args) {

        Proizvod prvi = new Proizvod();
        prvi.naziv = "čokolada";
        prvi.cena = 99.9;
        prvi.težina = 100;

        System.out.println("{{"+prvi.naziv+"}},{{"+prvi.cena+"}},{{"+prvi.težina+"}}");

        Proizvod drugi = new Proizvod();
        drugi.naziv = "jagode";
        drugi.cena = 367.9;
        drugi.težina = 456.3;

        System.out.println("{{"+drugi.naziv+"}},{{"+drugi.cena+"}},{{"+drugi.težina+"}}");
    }
}
