package p23_05_2022;

public class Kartica {
    private int pupust;
    private String brojKartice;
    public Kartica(){

    }
    public Kartica(int pupust, String brojKartice) {
        this.pupust = pupust;
        this.brojKartice = brojKartice;
    }

    public int getPupust() {
        return pupust;
    }
    public void setPupust(int pupust) {
        this.pupust = pupust;
    }
    public String getBrojKartice() {
        return brojKartice;
    }
    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }
    public void stampa ()  {
        System.out.println("Popust je "+this.pupust);
        System.out.println("Broj Kartice je "+this.brojKartice);
    }
}
