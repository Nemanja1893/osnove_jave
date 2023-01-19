package p19_01_2023;

public class Kuca extends Objekat{

    private int clanovi;
    public Kuca(String adresa, double povrsina, int zona,int clanovi) {
        super(adresa, povrsina, zona);
        this.clanovi = clanovi;
    }
    public int getClanovi() {
        return clanovi;
    }
    public void setClanovi(int clanovi) {
        this.clanovi = clanovi;
    }

    @Override
    public double vratiPorez(){
        return this.povrsina * this.koeficijent();
    }
    @Override
    public void stampaj(){
        System.out.println("KUCA");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj clanova: " + this.clanovi);
        System.out.println("Porez: " + this.vratiPorez());

    }
}
