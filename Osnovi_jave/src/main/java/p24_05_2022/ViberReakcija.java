package p24_05_2022;

public class ViberReakcija {
    private String emoji;
    private ViberKorisnik korisnik;

    public ViberReakcija() {
    }

    public ViberReakcija(String emoji) {
        this.emoji = emoji;
    }

    public ViberKorisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(ViberKorisnik korisnik) {
        this.korisnik = korisnik;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }
}
