package d19_05_2022;

public class MainProizvod {
    public static void main(String[] args) {
        Proizvod čokolada = new Proizvod();
        čokolada.naziv="Čokolada";
        čokolada.cena=80.5;
        čokolada.težina=100.0;
        čokolada.štampaj();

        čokolada.povećajCenu(10);
        System.out.println("Trenutna cena je "+čokolada.cena);

        System.out.println("Cena proizvoda sa popustom je "+čokolada.vratiCenuSaPopustom(15));

        System.out.println("Cena poštarine je "+čokolada.računajPoštarinu());

        System.out.println();


        Proizvod jagode = new Proizvod();
        jagode.naziv="Jagode";
        jagode.cena=250.5;
        jagode.težina=1500.0;

        jagode.štampaj();

        jagode.povećajCenu(20);
        System.out.println("Trenutna cena je "+jagode.cena);

        System.out.println("Cena proizvoda sa popustom je "+jagode.vratiCenuSaPopustom(15));

        System.out.println("Cena poštarine je "+jagode.računajPoštarinu());
        }
    }