package d19_01_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean placaSeKaucija;
    private double osnovnaCena;
    public StaklenaAmbalaza(String barKod, String naziv, double neto,
                            double bruto, double kaucija, boolean placaSeKaucija) {
        super(barKod, naziv, neto, bruto);
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
    }
    public double getKaucija() {
        return kaucija;
    }
    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }
    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }
    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }

    @Override
    public double vratiCenu(){
        double saKaucijom = this.osnovnaCena * 1.2 + this.kaucija;
        double bezKaucije = this.osnovnaCena * 1.2;

        return this.placaSeKaucija ? saKaucijom : bezKaucije;
    }
    @Override
    public void stampaj(){
        System.out.println("STAKLO");
        System.out.println("Bar kod: " + this.barKod);
        System.out.println("Naziv: " + this.naziv);
        System.out.println("Cena: " + this.vratiCenu());

    }
}
