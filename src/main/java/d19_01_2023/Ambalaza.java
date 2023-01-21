package d19_01_2023;

public abstract class Ambalaza {
    protected String barKod;
    protected String naziv;
    protected double neto;
    protected double bruto;

    public Ambalaza(){

    }
    public Ambalaza(String barKod, String naziv, double neto, double bruto) {
        this.barKod = barKod;
        this.naziv = naziv;
        this.neto = neto;
        this.bruto = bruto;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public double getNeto() {
        return neto;
    }
    public void setNeto(double neto) {
        this.neto = neto;
    }
    public double getBruto() {
        return bruto;
    }
    public void setBruto(double bruto) {
        this.bruto = bruto;
    }
    public String getBarKod() {
        return barKod;
    }

    public double tezina(){
        return this.bruto - this.neto;
    }
    public abstract double vratiCenu();
    public abstract void stampaj();
}
