package PlatnaKartica2;

public class MainPlatnaKartica {
    public static void main(String[] args) {
        VisaKartica prva = new VisaKartica(20000, "131-24-3332332","2020",
                "10","Jovan Jovanovic");
        MasterKartica druga = new MasterKartica(30000, "345-757474-34",
                "2021", "6");
        prva.izvrsiTransakciju(5);
        druga.naplatiOdrzavanje();
        prva.stampa();
        druga.stampa();
    }
}
