package Chart_slack;

import java.util.concurrent.Callable;

public class MainChart {
    public static void main(String[] args) {
      Chart first = new Chart("New chart");
      first.dodaj(4);
      first.dodaj(13);
      first.dodaj(33);
      first.dodaj(77);
      first.dodaj(23);
      first.dodaj(94);
      first.dodaj(17);
      first.dodaj(86);
      first.dodaj(100);
      first.stampa();
    }
}
