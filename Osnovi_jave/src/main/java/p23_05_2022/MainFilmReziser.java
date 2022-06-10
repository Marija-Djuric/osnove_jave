package p23_05_2022;

public class MainFilmReziser {
    public static void main(String[] args) {
      //  Film prvi = new Film("Hunt", 2013) ;

        Film drugi = new Film ();
        drugi.setNaziv("Another Round");
        drugi.setGodina(2020);

        Reziser neki = new Reziser ( "Thomas Vinterberg", 50);
        drugi.setReziser(neki);
        drugi.stampa();

      //  Reziser novi = new Reziser () ;
      //      novi.setImeIPrezime("Emir Kusturica");
       //     novi.setStarost(60);
    }  }

