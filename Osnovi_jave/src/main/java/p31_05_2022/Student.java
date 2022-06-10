package p31_05_2022;

public class Student extends Osoba {

    private int brojInteksa;
    private int dugZaSkolarinu;
    public Student(String imeIPrezime, String jmbg, int brojInteksa, int dugZaSkolarinu) {
        super(imeIPrezime, jmbg);
        this.brojInteksa=brojInteksa;
        this.dugZaSkolarinu=dugZaSkolarinu;
    }
    public int uplatiSkolarinu (int uplata) {
        if (uplata<dugZaSkolarinu)  {
            dugZaSkolarinu=dugZaSkolarinu-uplata;
        }return dugZaSkolarinu;
    }
    @Override
    public void stampa () {
        super.stampa();
        System.out.println(brojInteksa+", "+dugZaSkolarinu);
    }
}
