package p24_05_2022;

public class ZoomCall {
    private String linkZaPoziv;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall(String linkZaPoziv, String password, Korisnik host) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.host=host;
    }

    public String getLinkZaPoziv() {
        return linkZaPoziv;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }
    public void pokreniPoziv () {
        System.out.println("Zoom call: "+linkZaPoziv);
        System.out.println("Password: "+password);
        System.out.println("Host: "+this.host.getImeIPrezime());
        System.out.println("Guest: "+this.guest.getImeIPrezime());
        System.out.println("Maksimalno trajanje poziva je: "+this.host.maksimalnaDuzinaPoziva());
    }
}
