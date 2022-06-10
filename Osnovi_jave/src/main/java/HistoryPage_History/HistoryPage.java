package HistoryPage_History;

public class HistoryPage {
    private String naziv;
    private String link;
    private int sat;
    private int minut;
    private String username;
    private String password;

    public HistoryPage(String naziv, String link, int sat, int minut, String username, String password) {
        this.naziv = naziv;
        this.link = link;
        this.sat = sat;
        this.minut = minut;
        this.username = username;
        this.password = password;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getLink() {
        return link;
    }

    public int getSat() {
        return sat;
    }

    public int getMinut() {
        return minut;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public void setMinut(int minut) {
        this.minut = minut;
    }
    public void sacuvajKredencijale (String username1,String password1) {
        this.username=username1;
        this.password=password1;
    }
    public void obrisiKolacice () {
        this.username=null;
        this.password=null;
    }
    public void stampa ( ) {
        System.out.print(sat+"-"+minut+"-"+naziv+"..."+link);
        if (username!=null && password!=null) {
            System.out.println("*");
        }
    }
}
