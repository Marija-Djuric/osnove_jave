package PlaninaPlaninar;

public class MainPlaninari {
    public static void main(String[] args) {

        PlaninarskiDom dom = new PlaninarskiDom("Tara dom",1990);

        RekreativniPlaninar prvi = new RekreativniPlaninar(10,"Milos Milosevic",
                10,"Pomoravski",2600);
        RekreativniPlaninar drugi = new RekreativniPlaninar(20,"Jovan Jovanovic",
                6,"Sumadijski",1200);
        RekreativniPlaninar treci = new RekreativniPlaninar(30,"Ivan Ivanovic",
                7,"Raski",1300);
        Alpinista cetvrti = new Alpinista(40,"Goran Gagic",20);
        Alpinista peti = new Alpinista(50,"Dragan Dragic",10);
        Alpinista sesti = new Alpinista(60, "Nenad Nesic",15);

        dom.uclaniPlaninara(prvi);
        dom.uclaniPlaninara(drugi);
        dom.uclaniPlaninara(treci);
        dom.uclaniPlaninara(cetvrti);
        dom.uclaniPlaninara(peti);
        dom.uclaniPlaninara(sesti);

        Planina tara = new Planina("Tara","Srbija",1544);


        dom.izbaciPlaninara(10);

        dom.stampa();

        System.out.println("Uspešno se popelo "+dom.uspešnoSePopeli(tara)+" planinara.");
    }
}
