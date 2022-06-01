package d30_05_2022;

public class MainIspitStudent {
    public static void main(String[] args) {
       Ispit prvi = new Ispit("Invertebrati", 7, "Jovan Jovanovic");
       Ispit drugi = new Ispit("Evolucija", 9, "Milos Milosevic");
       Ispit treci = new Ispit("Vise biljke", 8, "Ivan Ivanovic");
       Ispit cetvrti = new Ispit("Hordati", 9, "Milica Milic");
       Ispit peti = new Ispit("Morfologija biljaka", 10, "Jovana Jovic");
       Ispit sesti = new Ispit("Fiziologija zivotinja", 8, "Petar Peric");

       Student noviStudent = new Student(33,"Milan Milosevic","osnovne");
       noviStudent.dodajIspit(prvi);
       noviStudent.dodajIspit(drugi);
       noviStudent.dodajIspit(treci);
       noviStudent.dodajIspit(cetvrti);
       noviStudent.dodajIspit(peti);
       noviStudent.dodajIspit(sesti);

       noviStudent.stampa();
    }
}
