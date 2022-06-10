package p24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSastojak {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Sastojak> sastojci=new ArrayList<Sastojak>();
        System.out.print("Broj sastojaka je ");
        int brojSastojaka=s.nextInt();
        for (int i=0; i< brojSastojaka; i++) {
            System.out.print("Naziv sastojka je ");
            String naziv = s.next();
            System.out.print("Cena je ");
            int cena = s.nextInt();
            Sastojak x = new Sastojak(naziv, cena);
            sastojci.add(x);
        }
        int suma=0;
        for (int i=0; i<sastojci.size(); i++) {
            suma=suma+sastojci.get(i).getCena();
        }
        System.out.println("Suma je "+suma);
    }
}
