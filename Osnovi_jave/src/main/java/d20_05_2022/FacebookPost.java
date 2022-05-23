package d20_05_2022;

public class FacebookPost {
    //.Kreirati klasu FacebookPost koja ima:
    //   Od atributa:
    //ime i prezime korisnika koji je objavio post
    //ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
    //tekst objave
    //broj lajkova
    //broj deljenja
    // Konstruktore:
    //difoltni konstuktor
    //konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
    //  Od metoda:
    //like(), koja povecava broj lajkova za 1.
    //dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
    //share(), koja povecava broj deljenja za 1
    //print(), koja stampa objavu u formatu:
    //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
    //(tekst objave)
    //Likes (broj lajkova) | Shares (broj deljenja)
    //U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju
    public String korisnikObjavio;
    public String korisnikObjavljen;
    public  String tekst;
    public int lajkovi;
    public int brojDeljenja;

    public FacebookPost() {
    }
    public FacebookPost (String korisnikObjavio, String korisnikObjavljen, String tekst){
        this.korisnikObjavio=korisnikObjavio;
        this.korisnikObjavljen=korisnikObjavljen;
        this.tekst=tekst;
    }
    public void like() {
        this.lajkovi=this.lajkovi+1;
    }
    public void dislike() {
        this.lajkovi=this.lajkovi-1;
    }
    public void share () {
        this.brojDeljenja=this.brojDeljenja+1;
    }
    public void print () {
        System.out.println(this.korisnikObjavio+">>>"+this.korisnikObjavljen);
        System.out.println(this.tekst);
        System.out.println("Likes "+this.lajkovi+" | Shares "+this.brojDeljenja);;
    }

}

