package p17_01_2023;

public class JednakostranicniTrougao extends Figura{
    private int a;

    public JednakostranicniTrougao(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double obim(){
        return 3 * this.a;
    }
    @Override
    public double povrsina(){
        return (this.a * this.a) * 1.73205 / 4;
    }
}
