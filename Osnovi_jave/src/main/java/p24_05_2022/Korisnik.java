package p24_05_2022;

public class Korisnik {
    private String imeIPrezime;
    private String tipLicence;

    public Korisnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
        this.tipLicence = "basic";
    }
    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getTipLicence() {
        return tipLicence;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public void pretplatiSe (int uplata) {
        if (uplata==100) {
            this.tipLicence="pro";
        } else if (uplata==150) {
            this.tipLicence="premium";
        }
    }
    public void ponistiPretplatu () {
        this.tipLicence="basic";
    }
    public int maksimalnaDuzinaPoziva () {
        if ( this.tipLicence.equals("basic")) {
            return 40;
        } else if (this.tipLicence.equals("pro")) {
            return 240;
        }else if (this.tipLicence.equals("premium")){
        return 1440;
    } else {
        return 0;
}
    }
    public void stampa () {
    System.out.println("Ime i prezime: "+imeIPrezime);
    }
}
