package d24_05_2022;


    public class ElektricniSporet {
        private String marka;
        private int garancija;
        private int maksUključenihUTrenutku;
        private Ringla goreLevo;
        private Ringla goreDesno;
        private Ringla doleLevo;
        private Ringla doleDesno;
        private int brojac=0;

        public ElektricniSporet(String marka, int garancija, int maksUključenihUTrenutku,
                                Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
            this.marka = marka;
            this.garancija = garancija;
            this.maksUključenihUTrenutku = maksUključenihUTrenutku;
            this.goreLevo = goreLevo;
            this.goreDesno = goreDesno;
            this.doleLevo = doleLevo;
            this.doleDesno = doleDesno;
        }

        public String getMarka() {
            return marka;
        }

        public int getGarancija() {
            return garancija;
        }

        public int getMaksUključenihUTrenutku() {
            return maksUključenihUTrenutku;
        }

        public Ringla getGoreLevo() {
            return goreLevo;
        }

        public Ringla getGoreDesno() {
            return goreDesno;
        }

        public Ringla getDoleLevo() {
            return doleLevo;
        }

        public Ringla getDoleDesno() {
            return doleDesno;
        }
        public void pojacaj (int pozicija) {


            if (pozicija==1 && !goreLevo.ukljucena()) {
                goreLevo.pojacajRinglu();
                brojac++;
            } else if (pozicija==1 && goreLevo.ukljucena()) {
                goreLevo.pojacajRinglu();
            } if (pozicija==2 && !goreDesno.ukljucena()) {
                goreDesno.pojacajRinglu();
                brojac++;
            } else if (pozicija==2 && goreDesno.ukljucena()) {
                goreDesno.pojacajRinglu();
            } if (pozicija==3 && !doleLevo.ukljucena())  {
                doleLevo.pojacajRinglu();
                brojac++;
            } else if (pozicija==3 && doleLevo.ukljucena())  {
                doleLevo.pojacajRinglu();
            } if (pozicija==4 && !doleDesno.ukljucena()) {
                doleDesno.pojacajRinglu();
                brojac++;
            } else if (pozicija==4 && doleDesno.ukljucena())  {
                doleDesno.pojacajRinglu();
            }
            if (brojac>maksUključenihUTrenutku) {
                iskljuciRinglu2(1);
                iskljuciRinglu2(2);
                iskljuciRinglu2(3);
                iskljuciRinglu2(4);
                if (pozicija==1) {
                    goreLevo.pojacajRinglu();
                }
                if (pozicija==2) {
                    goreDesno.pojacajRinglu();
                }
                if (pozicija==3) {
                    doleLevo.pojacajRinglu();
                }
                if (pozicija==4) {
                    doleDesno.pojacajRinglu();
                }
            }
        }
        public void iskljuciRinglu2 (int pozicija) {
            if (pozicija==1) {
                goreLevo.iskljuciRinglu();
            } if (pozicija==2) {
                goreDesno.iskljuciRinglu();
            } if (pozicija==3)  {
                doleLevo.iskljuciRinglu();
            } if (pozicija==4) {
                doleDesno.iskljuciRinglu();
            }}
        public  double ukupnaPotrosnja (int vremenskiPeriod) {
            return this.goreLevo.potrosnjaElEnergije(vremenskiPeriod)+
                    this.goreDesno.potrosnjaElEnergije(vremenskiPeriod)+
                    this.doleLevo.potrosnjaElEnergije(vremenskiPeriod)+
                    this.doleDesno.potrosnjaElEnergije(vremenskiPeriod);
        }public void stampa () {
            System.out.println(marka+" - "+garancija);
            System.out.println("Ringla");
            System.out.println("Gore levo: ");
            this.goreLevo.stampa();
            System.out.println("Gore desno: ");
            this.goreDesno.stampa();
            System.out.println("Dole levo: ");
            this.doleLevo.stampa();
            System.out.println("Dole desno: ");
            this.doleDesno.stampa();
        }
    }
