package AtleticarDisciplina;

import java.util.ArrayList;

public class Disciplina {
    private String ime;
    private String tip;
    private ArrayList<Atleticar> atleticari = new ArrayList<>();

    public Disciplina(String ime, String tip) {
        this.ime = ime;
        this.tip = tip;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }

    public void setAtleticari(ArrayList<Atleticar> atleticari) {
        this.atleticari = atleticari;
    }
    public void dodajAtleticara (Atleticar atleticar) {
        atleticari.add(atleticar);
    }
    public void diskvalifikujAtleticara (String imeIPrezime1) {
        for (int i = 0; i < atleticari.size(); i++) {
            if (imeIPrezime1.equals(atleticari.get(i).getImeIPrezime())) {
                atleticari.remove(i);
            }
        } }
    public Atleticar najboljiRezultat () {
        Atleticar najbolji = atleticari.get(0);
        for (int i = 1; i < atleticari.size(); i++) {
           if (atleticari.get(i).bolji(najbolji)) {
               najbolji=atleticari.get(i);
           }
        } return najbolji;
    }
    public void stampajPpobednikaDiscipline () {
        najboljiRezultat().stampa();
    }
    }
