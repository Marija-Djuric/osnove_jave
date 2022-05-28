package d24_05_2022;

public class Ringla {

        private String tip;
        private int jacina;
        private double jacinaGrejaca;

        public Ringla(String tip, double jacinaGrejaca) {
            this.tip = tip;
            this.jacina = 0;
            this.jacinaGrejaca = jacinaGrejaca;
        }
        public int getJacinaObicna() {
            return jacina;
        }
        private int maksimalnoPojačano() {
            if (this.tip.equals("obicna")) {
                return 3;
            } else if (this.tip.equals("ekspres")) {
                return 12;
            } else {
                return 0;
            }
        }
        public void pojacajRinglu () {
            if (jacina<maksimalnoPojačano()) {
                jacina++;
            }
        }
        public void iskljuciRinglu () {
            jacina=0;
        }
        public boolean ukljucena () {
            if (jacina>0) {
                return  true;
            }return  false;
        }
        public double potrosnjaElEnergije (int vremenskiPeriod) {
            return 100/maksimalnoPojačano()*jacina*jacinaGrejaca*vremenskiPeriod;
        }
        public void stampa() {
            System.out.print("Ringla je ");
            if (this.ukljucena()==true) {
                System.out.println("Ukljucena.");
            }else  {
                System.out.println("iskljucena");
            }
            System.out.println("Tip ringle: "+tip);
            System.out.println("Jacina: "+jacina);
            System.out.println("Grejac: "+jacinaGrejaca+"kW");
            System.out.println();
        }
    }

