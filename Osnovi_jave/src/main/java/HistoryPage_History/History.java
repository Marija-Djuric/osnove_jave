package HistoryPage_History;

import java.util.ArrayList;

public class History {
    ArrayList<HistoryPage>stranice=new ArrayList<>();
    public void otvoriStranicu (HistoryPage s) {
        stranice.add(s);
    }

    public History() {
    }

    public ArrayList<HistoryPage> getStranice() {
        return stranice;
    }

    public void setStranice(ArrayList<HistoryPage> stranice) {
        this.stranice = stranice;
    }

    public void obrisi (String link1) {
        for (int i = 0; i < stranice.size(); i++) {
            if (link1.equals(stranice.get(i).getLink()))  {
                stranice.remove(i);
            }
        }
    }
    public void obrisiKolaciceZaLink (String link1) {
        for (int i = 0; i < stranice.size(); i++) {
            if (link1.equals(stranice.get(i).getLink())) {
                stranice.get(i).obrisiKolacice();
            }
        }
    }
    public void obrisiIstoriju ()  {
        for (int i = 0; i < stranice.size(); i++) {
            stranice.remove(i);
        }
    }
    public void sacuvajKredencija (String naziv2, String username2, String password2)  {
        for (int i = 0; i < stranice.size(); i++)  {
            if (naziv2.equals(stranice.get(i).getNaziv()))  {
                stranice.get(i).sacuvajKredencijale(username2,password2);
            }
        }
    }
    public void pogledajIstoriju ()  {
        for (int i = 0; i < stranice.size(); i++) {
            stranice.get(i).stampa();
            System.out.println();
        }
    }
    public void obrisiSveKolacice ()  {
        for (int i = 0; i < stranice.size(); i++) {
            stranice.get(i).obrisiKolacice();
        }
    }
    public void obrisiSveKolaciceZaSadnjihSatVremena (int sat1, int minut1)   {
        for (int i = 0; i < stranice.size(); i++) {
            if (stranice.get(i).getSat()>sat1-1 && stranice.get(i).getMinut()>=minut1) {
                stranice.get(i).obrisiKolacice();
            }
        }
    }
}
