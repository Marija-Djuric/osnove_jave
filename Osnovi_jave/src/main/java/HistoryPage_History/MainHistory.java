package HistoryPage_History;

public class MainHistory {
    public static void main(String[] args) {
        HistoryPage prva = new HistoryPage("instagram","fiu4uhfkhkdj",0,34,
                "Jovan","454545454rzu");
        HistoryPage druga = new HistoryPage("YouTube","dhsiqurew489ruw",1,35,
                "Ivana","48484ru");
        HistoryPage treca = new HistoryPage("facebook","ertjeorijtieot94",0,11,
                "Ivica","9959595rir");
        HistoryPage cetvrta = new HistoryPage("g-mail","jirht98345u84",2,12,
                "Milica","834985erj");

        History nizStranica = new History();

        nizStranica.otvoriStranicu(prva);
        nizStranica.otvoriStranicu(druga);
        nizStranica.otvoriStranicu(treca);
        nizStranica.otvoriStranicu(cetvrta);

        nizStranica.obrisiKolaciceZaLink("fiu4uhfkhkdj");
        nizStranica.pogledajIstoriju();
        nizStranica.sacuvajKredencija("instagram","wewewe","232323");
        nizStranica.pogledajIstoriju();
        nizStranica.obrisiSveKolaciceZaSadnjihSatVremena(1,12);
        nizStranica.pogledajIstoriju();
        nizStranica.obrisiSveKolacice();
        nizStranica.pogledajIstoriju();
    }
}
