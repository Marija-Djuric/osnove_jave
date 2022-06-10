package Student;

public abstract class Student_ {
    protected String imeIPrezime;
    protected int brojIndeksa;
    protected int godinaStudija;

    public Student_() {
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public Student_(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
    }
    public abstract int cenaSkolarine ();
    public abstract boolean naBudzetu ();

    public void stampa ()  {
        System.out.println("Ime i prezime: "+imeIPrezime+
                ", broj indeksa: "+brojIndeksa+", godina studiranja: "+godinaStudija);
        System.out.print("Finansiranje: ");
        if (naBudzetu()) {
            System.out.println("na budzetu.");
        } else {
            System.out.println("samofinansirajuci.");
        }
        System.out.println("Cena skolarine je: "+cenaSkolarine());
    }
}
