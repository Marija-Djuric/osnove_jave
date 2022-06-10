package p24_05_2022;

public class FizickoLice {
    private  String imeIPrezime;
    private int brojLK;
    private String jmbg;
    private boolean većKupovao;

    public FizickoLice(String imeIPrezime, String jmbg, int brojLK) {
        this.imeIPrezime=imeIPrezime;
        this.jmbg = jmbg;
        this.brojLK=brojLK;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getBrojLK() {
        return brojLK;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isVećKupovao() {
        return većKupovao;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setBrojLK(int brojLK) {
        this.brojLK = brojLK;
    }

    public void setVećKupovao(boolean većKupovao) {
        this.većKupovao = većKupovao;
    }
    public void stampa () {
        System.out.print(imeIPrezime+", "+brojLK);
    }
}
