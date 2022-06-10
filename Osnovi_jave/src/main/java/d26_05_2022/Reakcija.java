package d26_05_2022;

public class Reakcija {
    private String tip;
    private String korisnikReagovao;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getKorisnikReagovao() {
        return korisnikReagovao;
    }

    public void setKorisnikReagovao(String korisnikReagovao) {
        this.korisnikReagovao = korisnikReagovao;
    }

    public Reakcija() {
    }

    public Reakcija(String tip, String korisnik) {
        this.tip = tip;
        this.korisnikReagovao = korisnik;
    }
}
