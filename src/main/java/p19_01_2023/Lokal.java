package p19_01_2023;

public class Lokal extends Objekat{
    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }
    @Override
    public double vratiPorez(){
        return this.povrsina * this.koeficijent() * 1.3;
    }
    @Override
    public void stampaj(){
        System.out.println("LOKAL:");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Zona: " + this.zona);
        System.out.println("Porez: " + this.vratiPorez());
    }
}
