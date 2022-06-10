package p24_05_2022;

public class MainKorisnikZoomCall {
    public static void main(String[] args) {
        Korisnik host = new Korisnik("Jovan Jovanovic");

        Korisnik guest = new Korisnik("Milos MIlosevic");

        ZoomCall poziv = new ZoomCall("erweuiruweue39428", "utututut8585", host);
        poziv.setGuest(guest);
        host.pretplatiSe(150);
        host.ponistiPretplatu();
        poziv.pokreniPoziv();
    }
}
