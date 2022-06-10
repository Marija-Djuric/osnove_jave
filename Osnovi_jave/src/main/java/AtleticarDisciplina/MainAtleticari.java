package AtleticarDisciplina;

public class MainAtleticari {
    public static void main(String[] args) {

        Disciplina skok = new Disciplina("Skok u dalj","skakacka");
        Disciplina trka = new Disciplina("100 m sa preponama", "trakacka");

        Skakac prvi = new Skakac("Milan Milic", 5.2);
        Skakac drugi = new Skakac("Nenad Nesic", 4.9);
        Skakac treci = new Skakac("Goran Gagic", 5.1);

        Trkac jedan = new Trkac("Jovan Jovanovic", 22.5);
        Trkac dva = new Trkac("Milos Milosevic",23.7);
        Trkac tri = new Trkac("Ivan Ivanovic", 21.9);

        skok.dodajAtleticara(prvi);
        skok.dodajAtleticara(drugi);
        skok.dodajAtleticara(treci);

        trka.dodajAtleticara(jedan);
        trka.dodajAtleticara(dva);
        trka.dodajAtleticara(tri);

        skok.diskvalifikujAtleticara("Milan Milic");
        skok.stampajPpobednikaDiscipline();
        trka.stampajPpobednikaDiscipline();
    }
}
