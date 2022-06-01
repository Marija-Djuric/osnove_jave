package Osoba_igrac_trener;

import java.util.ArrayList;
import java.util.Scanner;

public class MainOsobaIgracTrener {
    public static void main(String[] args) {
        ArrayList<Igrač> igraci = new ArrayList<>();
        ArrayList<Trener> treneri = new ArrayList<>();

        Igrač prvi = new Igrač();
        Igrač drugi = new Igrač();
        Igrač treci = new Igrač();
        igraci.add(prvi);
        igraci.add(drugi);
        igraci.add(treci);

        Scanner s = new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {

            System.out.print("Unesite ime i prezime igraca: ");
            String imeIPrezime1=s.next();
            igraci.get(i).setImeIPrezime(imeIPrezime1);

            System.out.print("Unesite jmbg igraca: ");
            String jmbg1=s.next();
            igraci.get(i).setJmbg(jmbg1);

            System.out.print("Unesite godinu rodjenja: ");
            int godinaRodjenja1=s.nextInt();
            igraci.get(i).setGodinaRodjenja(godinaRodjenja1);

            System.out.print("Unesite broj: ");
            int broj1=s.nextInt();
            igraci.get(i).setBroj(broj1);

            System.out.print("Unesite poziciju: ");
            String pozicija1=s.next();
            igraci.get(i).setPozicija(pozicija1);

            System.out.print("Da li je kapiten(true/false)?");
            boolean kapiten1=s.nextBoolean();
            igraci.get(i).setKapiten(kapiten1);
        }
        Trener jedan = new Trener();
        Trener dva = new Trener();
        Trener tri = new Trener();
        treneri.add(jedan);
        treneri.add(dva);
        treneri.add(tri);


        for (int i = 0; i <3 ; i++) {

            System.out.print("Unesite ime i prezime trenera: ");
            String imeIPrezime2=s.next();
            treneri.get(i).setImeIPrezime(imeIPrezime2);

            System.out.print("Unesite jmbg trenera: ");
            String jmbg2=s.next();
            treneri.get(i).setJmbg(jmbg2);

            System.out.print("Unesite godinu rodjenja: ");
            int godinaRodjenja2=s.nextInt();
            treneri.get(i).setGodinaRodjenja(godinaRodjenja2);

            System.out.print("Unesite godine iskustva: ");
            int godineIskustva2=s.nextInt();
            treneri.get(i).setGodineIskustva(godineIskustva2);

            System.out.print("Unesite tip trenera: ");
            String tip2=s.next();
            treneri.get(i).setTipTrenera(tip2);
        }
        prvi.stampa();
        drugi.stampa();
        treci.stampa();

        jedan.stampa();
        dva.stampa();
        tri.stampa();
    }
}
