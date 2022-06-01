package KartonOsobaIgrac;

public class Osoba {
    //2. Zadatak
    //Kreirati klasu Karton koja ima:
    //tip kartona (crveni, zuti)
    //konstuktore za koje mislite da ce vam trebati
    //gettere i settere za karton
    //Kreirati klasu Osoba koja ima:
    //ime i prezime
    //jmbg
    //godinu rodjenja
    //default-ni konstuktor
    //konstuktor sa parametrima
    //gettere i settere
    //metodu stampaj koja stampa u formatu:
    //(ime i prezime), (jmbg), (godina rodjenja)
    //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
    //broj (broj koji igrac nosi)
    //poziciju koju igra (odbrambeni, napadac, … )
    //niz kartona
    //kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
    //default-ni konstuktor
    //konstuktor sa parametrima
    //gettere i settere za broj, kapiten i poziciju
    //metodu dodaj karton, gde se dodaje karton u niz
    //metodu koja vraca broj zutih kartona
    //metodu koja vraca broj crvenih kartona
    //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
    //
    //U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
    protected String imeIPrezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba() {
    }

    public Osoba(String imeIPrezime, String jmbg, int godinaRodjenja) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampa ()  {
        System.out.println("Ime i prezime: "+imeIPrezime);
        System.out.println("JMBG: "+jmbg);
        System.out.println("Godina rođenja je "+godinaRodjenja);
    }
}
