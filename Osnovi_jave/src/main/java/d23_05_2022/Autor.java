package d23_05_2022;

public class Autor {
    private String imeIPrezime;

    public Autor() {
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public void stampa () {
        System.out.println(imeIPrezime);
    }
}
