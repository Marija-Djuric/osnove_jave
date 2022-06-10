package p19_05_2022;

public class MainAuto {
    public static void main(String[] args) {
        Auto golf = new Auto();
        golf.vozač="Jovan Jovanović";
        golf.marka="Golf";
        golf.brojVrata=4;
        golf.potrošnja=2.3;
        golf.trenutnaBrzina=70;
        golf.registracija="jdjdsijoisjde";
        golf.kubikaža=345;
        golf.registracijaDo=10;
        golf.godinaProizvodnje=1999;
        golf.kapacitetRezervoara=50;
        golf.trenutnoURezervoaru=20;



        golf.štampa();
        if (golf.prekoračenje(50)) {
            System.out.println("Brzina je prekoračena.");
        } else {
            System.out.println("Brzina nije prekoračena.");
        }
        if (golf.prekoračenje(40)) {
            System.out.println("Kazna za prekoračenje je "+golf.kazna(40));
        }
        golf.koči();
        golf.koči();
        System.out.println("Trenutna brzina je "+golf.trenutnaBrzina);
        golf.štampa();
        System.out.println();

        Auto fića = new Auto();
        fića.vozač="Miloš Milošević";
        fića.marka="Fića";
        fića.brojVrata=5;
        fića.potrošnja=1.3;
        fića.trenutnaBrzina=40;
        fića.registracija="iuedzfiweueirh";
        fića.kubikaža=1233;
        fića.registracijaDo=3;
        fića.godinaProizvodnje=1940;
        fića.kapacitetRezervoara=10;
        fića.trenutnoURezervoaru=5;


        fića.štampa();
        if (fića.prekoračenje(50)) {
            System.out.println("Brzina je prekoračena.");
        } else {
            System.out.println("Brzina nije prekoračena.");
        }
        fića.dodajGas();
        fića.dodajGas();
        System.out.println("Trenutna brzina je "+fića.trenutnaBrzina);
        fića.štampa();
        System.out.println("Trenutna potrošnja je "+fića.trenutnaPotrošnja());


        if (fića.oldtimer()){
            System.out.println("Auto je oldtimer.");
    }
        if (fića.isteklaRegistracija(4)) {
            System.out.println("Registracija je istekla.");
        }
        System.out.println("Cena registracije je "+fića.cenaRegistracija());
        System.out.println("Cena goriva nakon dolivanja je "+fića.natočiGorivo(5));

        if (golf.brzinaIsta(fića)) {
            System.out.println("Brzina je ista.");
        } else {
            System.out.println("Brzina nije ista.");
        }
        }
}