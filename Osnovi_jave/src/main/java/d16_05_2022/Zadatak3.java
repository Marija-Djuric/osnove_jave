package d16_05_2022;

public class Zadatak3 {
    //3.Zadatak
    //Napisati metodu koja stampa podatke o korisniku u formatu:
    //JMBG: [jmbg]
    //Ime: [ime]
    //Prezime: [prezime]
    //God. rodjenja: [god]
    //Aktivan: [true/false]
    //Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
    public static void main(String[] args) {
        podaciZaŠtampu("484848484848484","Jovan", "Jovanović", 2000, true);
    }
    static void podaciZaŠtampu (String jmbg, String ime, String prezime, int godinaRođenja, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rođenja: " + godinaRođenja);
        System.out.println("Aktivan: " + aktivan);
    }
}
