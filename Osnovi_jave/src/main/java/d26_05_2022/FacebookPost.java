package d26_05_2022;

import java.util.ArrayList;

public class FacebookPost {
    private String korisnikPostavioOglas;
    private String tekstObjave;

    private ArrayList <Reakcija> reakcije = new ArrayList<Reakcija> ();

    public String getKorisnikPostavioOglas() {
        return korisnikPostavioOglas;
    }

    public void setKorisnikPostavioOglas(String korisnikPostavioOglas) {
        this.korisnikPostavioOglas = korisnikPostavioOglas;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public FacebookPost(String korisnikPostavioOglas, String tekstObjave) {
        this.korisnikPostavioOglas = korisnikPostavioOglas;
        this.tekstObjave = tekstObjave;
    }
    public void reaguj (Reakcija reakcija) {
        for (int i=0; i< reakcije.size();i++) {
            if (this.reakcije.get(i).getKorisnikReagovao().equals(reakcija.getKorisnikReagovao())) {
                this.reakcije.remove(i);
            }
    } reakcije.add(reakcija);
    }
    private int brojReakcija (String tipReakcije) {


        int brojReakcija=0;
        for (int i=0; i< reakcije.size(); i++) {
            if (tipReakcije.equals(reakcije.get(i).getTip())) {
                brojReakcija++;
            }
}  return  brojReakcija;
    }

    public void stampa () {
        System.out.println(korisnikPostavioOglas);
        System.out.println(tekstObjave);
        System.out.println("Smajli "+brojReakcija(":)")+" | "+
                            "Like " +brojReakcija("like")+" | "+
                            "Srce "  +brojReakcija("srce"));
    }
    }