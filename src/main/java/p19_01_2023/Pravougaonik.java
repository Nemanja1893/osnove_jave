package p19_01_2023;

public class Pravougaonik extends Figura {

    private int a;
    private int b;

    public Pravougaonik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double obim(){
        return 2 * (this.a + this.b);
    }

    @Override
    public double povrsina() {
        return this.a * this.b;
    }
}
