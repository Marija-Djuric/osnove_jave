package p23_05_2022;

public class Video {
    private String in;
    private String naziv;
    private int duzina;
    private int brojLajkova;
    private int brojDislajkova;
    private int brojPregleda;

    public Video(String in, String naziv, int duzina, int brojLajkova, int brojDislajkova, int brojPregleda) {
        this.in = in;
        this.naziv = naziv;
        this.duzina = duzina;
        this.brojLajkova = brojLajkova;
        this.brojDislajkova = brojDislajkova;
        this.brojPregleda = brojPregleda;
    }

    public String getIn() {
        return in;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getDuzina() {
        return duzina;
    }

    public int getBrojLajkova() {
        return brojLajkova;
    }

    public int getBrojDislajkova() {
        return brojDislajkova;
    }

    public int getBrojPregleda() {
        return brojPregleda;
    }

    public int lajkuj () {
        return brojLajkova++;
    }
    public int dislajkuj () {
        return brojDislajkova++;
    }
    public int pogledaj () {
        return brojPregleda++;
    }
}
