package d12_01_2023;

public class Racun {
    private String broj;
    private String imeIPrezime;
    private double stanje;

    public Racun(String broj, double stanje) {
        this.broj = broj;
        this.stanje = stanje;
    }

    public String getBroj() {
        return broj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getStanje() {
        return stanje;
    }


    public void novoStanje(double stanje){

        this.stanje = stanje;

    }
    public void stampaj(){
        System.out.println(this.imeIPrezime + " - " + this.broj);
        System.out.println("Stanje na racunu je " + this.stanje);
    }
}
