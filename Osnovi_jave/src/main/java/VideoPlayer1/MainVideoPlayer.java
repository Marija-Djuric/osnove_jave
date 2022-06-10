package VideoPlayer1;

public class MainVideoPlayer {
    public static void main(String[] args) {
        VideoPlayer novi = new VideoPlayer(450.3, 120, 3, 144);
        TimeControl jedan = new TimeControl();
        AudioControl dva = new AudioControl();
        QualityOptimizerControl tri = new QualityOptimizerControl(20);
        jedan.izvrsiAkciju(novi);
        dva.izvrsiAkciju(novi);
        tri.izvrsiAkciju(novi);

        System.out.println(novi.trenutnoVreme);
        System.out.println(novi.jacinaZvuka);
        System.out.println(novi.kvalitetVidea);

    }
}
