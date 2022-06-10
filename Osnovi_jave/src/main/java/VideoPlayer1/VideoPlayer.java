package VideoPlayer1;

public class VideoPlayer {
    protected double duzinaVidea;
    protected double trenutnoVreme;
    protected int jacinaZvuka;
    protected int kvalitetVidea;

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public double getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(double trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public VideoPlayer(double duzinaVidea, double trenutnoVreme, int jacinaZvuka, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public VideoPlayer() {
    }
    public void stampa () {
        System.out.println("Trenutno vreme:"+trenutnoVreme);
        System.out.println("Jacina Zvuka"+jacinaZvuka);
        System.out.println("Kvalitet videa"+kvalitetVidea);
    }
}
