package AmbalazaKarticaKorpa;

public class MainKorpa {
    //Kreirati abstraktnu klasu Ambalaza koja ima:
    //barkod (primer: 328232-2823)
    //naziv artikla
    //neto tezinu
    //bruto tezinu
    //konstuktore (default-ni i sa parametrima)
    //gettere i settere
    //metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
    //abstraktnu metodu koja vraca cenu artikla
    //abstraktnu metodu stampaj
    //
    //Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
    //atribut koji kaze da li se moze reciklirati
    //osnovna cena
    //gettere i setter za atribute
    //konstuktori koji su vam potrebni
    //racuna cenu tako da ispunjava uslova:
    //ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
    //ako nije u cenu ulazi samo osnovna cena
    //metoda stampaj stampa sve podatke iz klase tetrapak.
    //
    //Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
    //kaucija za flasu
    //atribut koji kaze da li se za flasu placa kaucija
    //osnovna cena
    //gettere i setter za atribute
    //konstuktori koji su vam potrebni
    //racuna cenu
    //ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
    //ako se ne placa, (osnovna cena) * 1.2
    //metoda stampaj stampa sve podatke iz klase staklena flasa.
    //
    //Kreirati klasu SuperKartica koja ima:
    //broj kartice
    //ime i prezime vlasnika
    //popust (200, 500, … )
    //konstuktore (default-ni i sa parametrima)
    //gettere i settere
    //metodu stampaj koja stampa karticu u formatu:
    //(broj kartice), (ime i prezime)
    //
    //Kreirati klasu Korpa koja ima:
    //niz ambalaza
    //metodu dodaj ambalazu
    //metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
    //privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
    //metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar
    // funkcije se prima Super karticu iz koje se cita popust.
    //
    //U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova
    // i istestirati sve metode i ispisati ukupnu cenu sa popustom.
    public static void main(String[] args) {

        Korpa prva = new Korpa();

        Tetrapak mleko = new Tetrapak("646636-2323","mleko",
                1.1,1.0, true,99);
        Tetrapak jogurt = new Tetrapak("3824636-1231","jogurt",1.2,
                1.1,false,120);
        StaklenaAmbalaza vino = new StaklenaAmbalaza("77865342-343","vino",
                1.3,1.2,30,true,345);
        StaklenaAmbalaza pivo = new StaklenaAmbalaza("973923473-32434","pivo",
                0.6,0.5,20,false,80);

        prva.dodajAmbalazu(mleko);
        prva.dodajAmbalazu(jogurt);
        prva.dodajAmbalazu(vino);
        prva.dodajAmbalazu(pivo);

        for (int i = 0; i < prva.getAmbalaze().size(); i++) {
            prva.getAmbalaze().get(i).stampa();
        }
        SuperKartica kartica = new SuperKartica("234-42424242-23","Milan Ilic",
                100);
        prva.izbaciAmbalazu("77865342-343");

        System.out.println("Cena sa popustom je "+prva.cenaSaPopustom(200));
        System.out.println();
        System.out.println("Ukupna cena korpe je "+prva.ukupnaCenaKorpe(kartica));
    }
}
