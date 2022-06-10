package p20_05_2022;

public class Radnik {
    public String jmbg;
    public String imeIprezime;
    public int brojDece;
    public int stepenStručneSpreme;
    public int godineStaža;

    public Radnik (String jmbg) {
        this.jmbg=jmbg;
    }
    public Radnik(String jmbg, String imeIprezime, int brojDece, int stepenStručneSpreme, int godineStaža) {
        this.jmbg=jmbg;
        this.imeIprezime=imeIprezime;
        this.brojDece=brojDece;
        this.stepenStručneSpreme=stepenStručneSpreme;
        this.godineStaža=godineStaža;
    }
    public double minuliRad () {
        if (this.godineStaža<10) {
            return godineStaža*0.05;
        } else if (this.godineStaža<20) {
            return godineStaža*0.05+(godineStaža-9)*0.075;
        } else {
            return godineStaža*0.05+(godineStaža-9)*0.075+(godineStaža-19)*0.1;
        }


        }
    }


