package d23_05_2022;

public class MainAutorKnjiga {
    //Kreirati klasu Autor koja ima
    //-ime i prezime
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu:
    //(ime autora) (prezime autora)
    //Kreirati klasu Knjiga koji ima:
    //-ISBN
    //-naziv
    //-godina izdanja
    //-autor
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu (izbegavati dupliranje koda):
    //(ISBN)
    //(naziv) - (godina izdanja)
    //autor: (ime autora) (prezime autora)
    //	U glavnom programu napraviti vise autora sa vise knjiga.
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.setImeIPrezime("Milos Milosevic");

        Knjiga prva = new Knjiga();
        prva.setIsbn("27773-3434-33-224");
        prva.setNaziv("Crvena");
        prva.setGodinaIzdanja(2020);
        prva.setAutor(autor1);
        prva.stampa();

        Knjiga druga = new Knjiga();
        druga.setIsbn("87428765-434534-53466");
        druga.setNaziv("Plava");
        druga.setGodinaIzdanja(2021);
        druga.setAutor(autor1);
        druga.stampa();

        Knjiga treca = new Knjiga();
        treca.setIsbn("23422-46546-7566-");
        treca.setNaziv("Zelena");
        treca.setGodinaIzdanja(2022);
        treca.setAutor(autor1);
        treca.stampa();

        Autor autor2 = new Autor();

        Knjiga cetvrta = new Knjiga();
        cetvrta.setIsbn("248973-3434-33-224");
        cetvrta.setNaziv("Zuta");
        cetvrta.setGodinaIzdanja(2019);
        cetvrta.setAutor(autor2);
        cetvrta.stampa();

        Knjiga peta = new Knjiga();
        peta.setIsbn("248973-67-33457-224");
        peta.setNaziv("Siva");
        peta.setGodinaIzdanja(2016);
        peta.setAutor(autor2);
        peta.stampa();
    }
}
