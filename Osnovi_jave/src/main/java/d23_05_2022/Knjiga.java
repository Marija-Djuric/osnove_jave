package d23_05_2022;

public class Knjiga {
    private String isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void stampa (){
        System.out.println(isbn);
        System.out.println(naziv+" - "+godinaIzdanja);
        System.out.println("Autor: "+this.autor.getImeIPrezime());
        System.out.println();
    }
}
