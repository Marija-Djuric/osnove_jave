package p20_05_2022;

import java.sql.SQLOutput;

public class MainRadnik {
    public static void main(String[] args) {
        Radnik Ivan = new Radnik("27272727272727272727");
        System.out.println(Ivan.jmbg);
        Radnik Jovan = new Radnik("27272727272727272727", "Jovan Milošević", 2, 7, 10);
        System.out.println(Jovan.imeIprezime);
        System.out.println(Jovan.minuliRad());
    }
}
