package Sektor_radnik_menadzer_magacioner;

public class Magacioner extends Radnik{
    double sumaPlata=0;
    int brojac=0;

    public Magacioner(String imeIPrezime) {
        super(imeIPrezime);
    }

    private double prosecnaPlataUSektoru (){
        double sumaPlata=0;
        int brojac=0;
        for (int i = 0; i < this.sektori.size(); i++) {
            sumaPlata=sumaPlata+this.sektori.get(i).getPlata();
            brojac++;
        }
        return sumaPlata/brojac*0.5;
    }
    @Override
    public double plataRadnika() {
      return prosecnaPlataUSektoru()*this.brojac;
    }
}
