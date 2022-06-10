package VideoPlayer1;

public class QualityOptimizerControl extends Control{

    private double brzinaInterneta;

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl() {
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        int kvalitet=0;
        if (brzinaInterneta*10.1<=144) {
            kvalitet=144;
        } else if (brzinaInterneta*10.1<=240) {
            kvalitet=240;
        } else if (brzinaInterneta*10.1<=360) {
            kvalitet=360;
        } else if (brzinaInterneta*10.1<=480) {
            kvalitet=480;
        } else if (brzinaInterneta*10.1<=720) {
            kvalitet=720;
        }else {
            kvalitet=1080;
        }
        player.setKvalitetVidea(kvalitet);
    }
}
