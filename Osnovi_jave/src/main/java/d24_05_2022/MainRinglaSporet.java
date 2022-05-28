package d24_05_2022;

public class MainRinglaSporet {
        public static void main(String[] args) {
            Ringla goreLevo = new Ringla("obicna", 0.8);
            Ringla goreDesno = new Ringla("obicna", 1.0);
            Ringla doleLevo = new Ringla("ekspres", 1.5);
            Ringla doleDesno = new Ringla("ekspres", 2.0);

            ElektricniSporet sporet = new ElektricniSporet("Beko",5,
                    2,goreLevo, goreDesno, doleLevo, doleDesno);
            sporet.pojacaj(2);
            sporet.pojacaj(3);
            sporet.pojacaj(4);
            sporet.stampa();
        }
    }

