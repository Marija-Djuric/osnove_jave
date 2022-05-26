package d24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class MainZeleniKarton {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ZeleniKarton> zeleniKarton=new ArrayList<ZeleniKarton>();
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("Ime i prezime studenta: ");
            String student1=s.next();
            System.out.println("Broj indeksa: ");
            int brojIndeksa1=s.nextInt();
            System.out.println("Predmet: ");
            String predmet1=s.next();
            System.out.println("Ime i prezime profesora: ");
            String profesor1=s.next();
            System.out.println("Ocena: ");
            int ocena1=s.nextInt();
            ZeleniKarton x = new ZeleniKarton(student1, brojIndeksa1, predmet1, profesor1, ocena1);
            zeleniKarton.add(x);
        }
        double prosecnaOcenaSvi=0;
        int suma=0;
        int sumaPolozenih=0;
        int brojPolozenih=0;
        double prosecnaOcenaPolozeni=0;
        for (int i=0; i< zeleniKarton.size(); i++) {
            System.out.print(zeleniKarton.get(i).getStudent()+" ");
            System.out.print(zeleniKarton.get(i).getBrojIndeksa()+" ");
            System.out.print(zeleniKarton.get(i).getPredmet()+" ");
            System.out.print(zeleniKarton.get(i).getProfesor()+" ");
            System.out.println(zeleniKarton.get(i).getOcena());

            suma=suma+zeleniKarton.get(i).getOcena();
            prosecnaOcenaSvi=suma*1.0/ zeleniKarton.size();

            if (zeleniKarton.get(i).ispitPolozen()) {
                sumaPolozenih=sumaPolozenih+zeleniKarton.get(i).getOcena();
                brojPolozenih++;
                prosecnaOcenaPolozeni=sumaPolozenih*1.0/brojPolozenih;
            }
        }
        System.out.println("Prosek svih ispita je: "+prosecnaOcenaSvi);
        System.out.println("Prosek položenih ispita je: "+prosecnaOcenaPolozeni);
    }
}
