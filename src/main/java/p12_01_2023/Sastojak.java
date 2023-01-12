package p12_01_2023;

public class Sastojak {
    private String ime;
    private double cena;

    public Sastojak(String ime, double cena) {
        this.ime = ime;
        this.cena = cena;
    }

    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
}
