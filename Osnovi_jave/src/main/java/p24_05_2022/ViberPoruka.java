package p24_05_2022;

public class ViberPoruka {
    private String tekst;
    private String vremeSlanja;
    private ViberKorisnik poslao;
    private ViberKorisnik primio;
    private ViberReakcija reakcija;

    public ViberPoruka() {
    }

    public ViberPoruka(String tekst, String vremeSlanja) {
        this.tekst=tekst;
        this.vremeSlanja = vremeSlanja;
    }

    public ViberKorisnik getPoslao() {
        return poslao;
    }

    public void setPoslao(ViberKorisnik poslao) {
        this.poslao = poslao;
    }

    public ViberKorisnik getPrimio() {
        return primio;
    }

    public void setPrimio(ViberKorisnik primio) {
        this.primio = primio;
    }

    public ViberReakcija getReakcija() {
        return reakcija;
    }

    public void setReakcija(ViberReakcija reakcija) {
        this.reakcija = reakcija;
    }
    public void prikazi () {
        System.out.println("From "+poslao.getImeIPrezime());
        if (getPoslao().isTrenutnoAktivan()==true) {
            System.out.println("* Active now - at ");
        }else {
        System.out.println("*Not Active - at ");
    }
        System.out.println(vremeSlanja);
        System.out.println("To: "+primio.getImeIPrezime());
        System.out.println(tekst+" : ");
        if (this.reakcija!=null) {
            System.out.println(this.getReakcija().getEmoji()+" from "+
                               this.getReakcija().getKorisnik().getImeIPrezime());
        }
    }    }

