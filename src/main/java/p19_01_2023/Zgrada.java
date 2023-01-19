package p19_01_2023;

public class Zgrada extends Objekat{
    private int brojStanova;
    public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }
    public int getBrojStanova() {
        return brojStanova;
    }
    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double vratiPorez(){
        return this.povrsina * this.koeficijent() * this.brojStanova;
    }
    @Override
    public void stampaj(){
        System.out.println("ZGRADA:");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj stanova: " + this.brojStanova);
        System.out.println("Porez: " + this.vratiPorez());

    }
}
