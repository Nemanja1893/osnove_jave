package p10_01_2023;

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private double cenaIzrade;
    public Proizvod(String naziv, Kupac kupac, double cena){
        this.naziv = naziv;
        this.kupac = kupac;
        this.cenaIzrade = cena;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public double racunajCenu(){
        return cenaIzrade * 1.9 * (100 - kupac.getKartica().getPopust()) / 100;
    }
    public void stampaj(){
        System.out.println(naziv + " - " + racunajCenu());
        System.out.println(kupac.getImeIPrezime() + " - " + kupac.getKartica().getBrojKartice());
    }
}
