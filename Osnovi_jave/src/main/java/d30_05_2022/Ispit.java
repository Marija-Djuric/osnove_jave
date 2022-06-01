package d30_05_2022;

public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String profesor;

    public Ispit() {
    }

    public Ispit(String nazivPredmeta, int ocena, String profesor) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    public boolean ispitPolozen ()  {
        if (ocena>5) {
            return true;
        }return false;
    }
    public void stampa () {
        System.out.println(nazivPredmeta+" - "+profesor+" - "+ocena);
    }
}
