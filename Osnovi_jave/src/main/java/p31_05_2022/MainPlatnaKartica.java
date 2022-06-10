package p31_05_2022;

public class MainPlatnaKartica {
    public static void main(String[] args) {
        VisaKartica prva = new VisaKartica(20000, "131-24-3332332","2020",
                "10","Jovan Jovanovic");
        MasterKartica jedan = new MasterKartica(30000, "345-757474-34",
                "2021", "6");
        prva.izvrsiTransakciju(5);
        jedan.naplatiOdrzavanje();
        prva.stampa();
        jedan.stampa();

    }
}
