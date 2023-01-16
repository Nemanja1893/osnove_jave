package p16_01_2023;

public class PlatnaKartica {
    protected double suma;
    protected String broj;
    protected int godinaVazenja;
    protected int mesecVazenja;

    public PlatnaKartica(double suma, String broj, int godinaVazenja, int mesecVazenja) {
        this.suma = suma;
        this.broj = broj;
        this.godinaVazenja = godinaVazenja;
        this.mesecVazenja = mesecVazenja;
    }

    public double getSuma() {
        return suma;
    }

    public String getBroj() {
        return broj;
    }

    public int getGodinaVazenja() {
        return godinaVazenja;
    }

    public int getMesecVazenja() {
        return mesecVazenja;
    }

    public void dodajSredstva(double sredstva){
        this.suma += sredstva;
    }
    public void izvrsiTransakciju(double vrednost){
        this.suma -= vrednost;
    }
    public void stampaj(){
        System.out.println(this.broj + ", " + this.mesecVazenja + "/"
                            + this.godinaVazenja + ", " + this.suma);
    }
}
