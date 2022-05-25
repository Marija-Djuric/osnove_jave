package d23_05_2022;

public class Vaga {
    private String mernaJedinica;
    private Proizvod proizvod;

    public Vaga() {
    }

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public double izracunajCenu (double unetaTezina) {
        if (mernaJedinica.equals("kg")){
            return unetaTezina*this.proizvod.getCenaKg();
        } return unetaTezina*this.proizvod.getCenaLb();
        }
    public void stampa (double unetaTezina) {
        System.out.println(this.proizvod.getSifra()+" - "+this.proizvod.getNaziv());
        if (mernaJedinica.equals("kg")){
        System.out.println(this.proizvod.getCenaKg()+mernaJedinica+" * "+unetaTezina);
        }else {
            System.out.println(this.proizvod.getCenaLb()+mernaJedinica+" * "+unetaTezina);
        }
        System.out.println("Ukupno: "+this.izracunajCenu(unetaTezina));
    }
        }
