package p20_05_2022;

public class Tacka {
    public int x;
    public int y;

    public void štampaj () {
        System.out.println("Koordinate su: "+this.x+" i "+y);
    }
    public Tacka() {
}
    public Tacka(int x, int y) {
        this.x=x;
        this.y=y;
    }
}