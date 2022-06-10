package p23_05_2022;

public class MainKorisnikFacebookPost {
    public static void main(String[] args) {
        Korisnik prvi = new Korisnik();
        prvi.setIme("Jovan");
        prvi.setPrezime("Jovanović");

        FacebookPost zdravo = new FacebookPost();
        zdravo.setOpis("Zdravo, kako ste?");
        zdravo.setAutor(prvi);
        zdravo.stampa();

        Korisnik drugi = new Korisnik ("Ivan","Ivanovic" );
        FacebookPost slika = new FacebookPost("Priroda.", drugi);
        slika.stampa();
    }
}
