package Vezbanje.Planinar;

public class Alpinista extends Planinar{
    private int poeni;

    public Alpinista(int id, String imeIPrezime, int poeni) {
        super(id, imeIPrezime);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }
    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public boolean uspesanUspon(Planina p){

        return p.getVisina() < 4000;
    }
    @Override
    public double vratiClanarinu(){
        int faktorPoena = this.poeni * 50;
        return 1500 - faktorPoena;
    }
    @Override
    public void stampaj(){
        System.out.println("Alpinista, id: " + this.id);
        System.out.println(this.imeIPrezime);
        System.out.println("Broj poena: " + this.poeni);
        System.out.println("-------------------------------");
    }
}
