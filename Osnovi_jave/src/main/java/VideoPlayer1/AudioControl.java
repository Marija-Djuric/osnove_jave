package VideoPlayer1;

public class AudioControl extends Control {
    private boolean pojacaj;

    public boolean isPojacaj() {
        return pojacaj;
    }

    public void setPojacaj(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    public AudioControl(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    public AudioControl() {
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        int novaJacinaZvuka=player.getJacinaZvuka();
        if (pojacaj) {
            novaJacinaZvuka=novaJacinaZvuka+1;
        } else {
            novaJacinaZvuka=novaJacinaZvuka-1;
        }
        if (novaJacinaZvuka> 100) {
            novaJacinaZvuka= 100;
        }
        if (novaJacinaZvuka<0) {
            novaJacinaZvuka=0;
        }
        player.setJacinaZvuka(novaJacinaZvuka);
    }

}
