package p23_05_2022;

public class FacebookPost {
    private String opis;
    private Korisnik autor;

    public FacebookPost() {
    }
    public FacebookPost (String opis, Korisnik autor) {
        this.opis=opis;
        this.autor=autor;
    }
    public String getOpis() {
        return opis;
    }
    public void setOpis(String opis) {
        this.opis = opis;
    }
    public Korisnik getAutor() {
        return this.autor;
    }
    public void setAutor(Korisnik autor) {
        this.autor = autor;
    }
    public void stampa () {
        System.out.println("Opis je: "+this.opis);
        System.out.println("Ime korisnika je: "+this.autor.getIme()+" "+this.autor.getPrezime());
    }
}

