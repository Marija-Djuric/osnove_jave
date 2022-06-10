package Figura_;

public class JednakostranicniTrougao extends Figura{
    protected int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public JednakostranicniTrougao(int a) {
        this.a = a;
    }

    public JednakostranicniTrougao() {
    }

    @Override
    public double povrsina() {
        return a*a*1.73205/4;
    }

    @Override
    public double obim() {
        return 3*a;
    }
}
