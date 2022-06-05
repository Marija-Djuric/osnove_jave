package Sektor_radnik_menadzer_magacioner;

public class Menadzer extends Radnik{

    public Menadzer(String imeIPrezime) {
        super(imeIPrezime);
    }

    @Override
    public double plataRadnika() {
        double ukupnaPlata=0;
        for (int i = 0; i < this.sektori.size(); i++) {
           ukupnaPlata=ukupnaPlata+this.sektori.get(i).getPlata();
    }return ukupnaPlata;
}
}