package VideoPlayer1;

public class TimeControl extends Control{
    private boolean pomeritiUnapred;

    public TimeControl() {
    }

    public TimeControl(boolean pomeritiUnapred) {
        this.pomeritiUnapred = pomeritiUnapred;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
      double buduceVreme=player.getTrenutnoVreme();
      if (pomeritiUnapred){
          buduceVreme=buduceVreme+15;
        } else {
          buduceVreme=buduceVreme-15;
      }
      if (buduceVreme > player.getDuzinaVidea())  {
          buduceVreme= player.duzinaVidea;
      }
      if (buduceVreme < 0) {
          buduceVreme=0;
      }
      player.setTrenutnoVreme(buduceVreme);
    }
}
