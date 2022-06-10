package p23_05_2022;

public class YoutubePlayer {
    private Video video;
    private int kvalitet;
    private String rezim;
    private int jacinaZvuka;
    private int trenutnoVreme;

    public YoutubePlayer() {
        this.kvalitet = 144;
        this.rezim = "mini player";
        this.jacinaZvuka = 75;
    }

    public Video getVideo() {
        return video;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public String getRezim() {
        return rezim;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void ucitajVideo (Video novi) {
        trenutnoVreme=0;

    }
    public int pojacaj() {
        if (jacinaZvuka <= 100) {
            return jacinaZvuka + 10;
        }
            return 100;
    }

    public int smanji() {
        if (jacinaZvuka < 0) {
            return 0;
        }
            return jacinaZvuka - 10;
    }
    public void postaviKvalitet (int brzina) {
        if (brzina < 2) {
            this.kvalitet=144;
        }else if (brzina < 4) {
            this.kvalitet=240;
        }else if (brzina<6) {
            this.kvalitet=360;
        }else if (brzina<8) {
            this.kvalitet=720;
        }else {
            this.kvalitet=1080;
        }
        }
    public void aktivirajMiniPlayerMod() {
        this.rezim="mini player";
    }
    public void aktivirajBioskopskiMod() {
        this.rezim="bioskopski rezim";
    }
    public void aktivirajPrekoCelogEkranaMod() {
        this.rezim="preko celog ekrana";
    }
    public int premotajUnapred () {
        if (video.getDuzina()-trenutnoVreme>=10) {
        return trenutnoVreme+10;
    } return trenutnoVreme;
    }
    public  int premotajUnazad () {
        if (trenutnoVreme>=10) {
            return trenutnoVreme-10;
        }return trenutnoVreme;
    }
    public void iscrtajZvuk () {
        if (jacinaZvuka==0) {
            System.out.println("</");
        } else {
            System.out.println("<: ");
        for (int i = 0; i < jacinaZvuka/10; i++) {
            System.out.println("|");
        }}}
    public void iscrtajRezim () {
        if (rezim.equals("mini player")) {
            System.out.println("[ ]");
        }
        if (rezim.equals("bioskopski rezim")) {
            System.out.println("[ ..]");
        }
        if (rezim.equals("preko celog ekrana")) {
            System.out.println("[||||]");
        }
    }
    public void iscrtajTrenutnoVreme () {
        double minut=1.0*trenutnoVreme/60;
        double sekund=1.0*trenutnoVreme%60;
        double minutUkupnogVideo=1.0*video.getDuzina()/60;
        double sekundUkupnogVidea=1.0* video.getDuzina()%60;
        System.out.print(minut+":"+sekund+" / "+minutUkupnogVideo+":"+sekundUkupnogVidea);
        }
    public void iscrtajTimeline ()  {
        double brojZvezdica=1.0*trenutnoVreme*100/ video.getDuzina();
        double brojTackica=100-brojZvezdica;

        for (int i = 0; i < brojZvezdica; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < brojTackica; i++) {
            System.out.print(".");
        }
    }
    public void iscitaj () {
        iscrtajTrenutnoVreme();
        System.out.print("Zvuk: ");
        iscrtajZvuk();
        System.out.print("Timeline: ");
        iscrtajTimeline();
        System.out.print("Kvalitet: ");
        System.out.println(kvalitet+"p");
        System.out.print("Rezim: ");
        iscrtajRezim();
        System.out.println(video.getNaziv());
        System.out.println("Likes: "+video.getBrojLajkova()+" | "+"Dislikes"+ video.getBrojDislajkova());
        System.out.println(video.getBrojPregleda()+" pregleda");
    }
    }


