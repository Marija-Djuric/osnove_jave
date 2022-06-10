package Figura_;

public abstract class Figura {
    public abstract double povrsina ();
    public abstract double obim ();
    public void stampa () {
        System.out.println("Povrsina je "+povrsina());
        System.out.println("Obim je "+obim());
    }
}
