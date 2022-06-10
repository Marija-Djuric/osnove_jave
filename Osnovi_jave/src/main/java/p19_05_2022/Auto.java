package p19_05_2022;

public class Auto {
    public String vozač;
    public String marka;
    public int brojVrata;
    public double potrošnja;
    public int trenutnaBrzina;
    public String registracija;
    public boolean klima;
    public int godinaProizvodnje;
    public int registracijaDo;
    public int kubikaža;
    double kapacitetRezervoara;
    double trenutnoURezervoaru;

    public void štampa() {
        System.out.println(this.vozač);
        System.out.println(this.marka+" - "+this.brojVrata+"-ro vrata.");
        System.out.println("Sa potrošnjom od "+this.potrošnja+" l na 100km.");
        System.out.println(this.trenutnaBrzina+" km/h je trenutna brzina auta.");
        System.out.println("Registracija: "+registracija);
    }
    public boolean prekoračenje (int ograničenje){
        //return this.trenutnaBrzina>ograničenje;
        if( this.trenutnaBrzina>ograničenje) {
            return  true;
        }else {
            return false;
    } }
    public int kazna (int ograničenje) {
        //if (this.trenutnaBrzina(ograničenje))
        if (this.trenutnaBrzina>ograničenje) {
           return (this.trenutnaBrzina-ograničenje)*1000;
        } //else {
            return 0;
    }
    public void dodajGas () {
        trenutnaBrzina=trenutnaBrzina+10;
    }
    public void koči () {
        trenutnaBrzina=trenutnaBrzina-10;
        if (trenutnaBrzina<0) {
            trenutnaBrzina=0;
        }
    }
    public double trenutnaPotrošnja () {
        if(klima) {
            return (trenutnaBrzina/100.0*potrošnja*1.2);
        } else {
            return (trenutnaBrzina/100.0*potrošnja);
        }
    }
    public boolean oldtimer () {
        return (this.godinaProizvodnje<1950);
    }
    public boolean isteklaRegistracija (int trenutniMesec) {
        return trenutniMesec>this.registracijaDo;
    }
    public double cenaRegistracija () {
        if (this.kubikaža<2000) {
            return this.kubikaža*100;
        }return this.kubikaža*100*1.3;
        }
    public double natočiGorivo (double dodatoGorivo) {
        if (trenutnoURezervoaru+dodatoGorivo <= kapacitetRezervoara) {
            return dodatoGorivo*170;
        } return  (kapacitetRezervoara-dodatoGorivo)*170;
    }
    public boolean brzinaIsta (Auto fića) {
        return trenutnaBrzina==fića.trenutnaBrzina;
    }
    }