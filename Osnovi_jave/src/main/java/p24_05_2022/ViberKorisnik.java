package p24_05_2022;

public class ViberKorisnik {
    private String imeIPrezime;
    private int brojTelefona;
    private boolean trenutnoAktivan;

    public ViberKorisnik() {
    }

    public ViberKorisnik(String imeIPrezime, int brojTelefona, boolean trenutnoAktivan) {
        this.imeIPrezime = imeIPrezime;
        this.brojTelefona = brojTelefona;
        this.trenutnoAktivan = trenutnoAktivan;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(int brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public boolean isTrenutnoAktivan() {
        return trenutnoAktivan;
    }

    public void setTrenutnoAktivan(boolean trenutnoAktivan) {
        this.trenutnoAktivan = trenutnoAktivan;
    }
}
