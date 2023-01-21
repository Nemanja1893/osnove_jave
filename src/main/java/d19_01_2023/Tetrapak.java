package d19_01_2023;

public class Tetrapak extends Ambalaza{
    private boolean seReciklira;
    private double osnovnaCena;

    public Tetrapak(String barKod, String naziv, double neto, double bruto,
                                    boolean seReciklira, double osnovnaCena) {
        super(barKod, naziv, neto, bruto);
        this.seReciklira = seReciklira;
        this.osnovnaCena = osnovnaCena;
    }
    public boolean isSeReciklira() {
        return seReciklira;
    }
    public void setSeReciklira(boolean seReciklira) {
        this.seReciklira = seReciklira;
    }
    public double getOsnovnaCena() {
        return osnovnaCena;
    }
    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double vratiCenu(){
        double cenaRec = this.tezina() * 1.5 + this.osnovnaCena;

        return this.seReciklira ? cenaRec : this.osnovnaCena;
    }
    @Override
    public void stampaj(){
        System.out.println("TETRAPAK");
        System.out.println("Bar kod: " + this.barKod);
        System.out.println("Naziv: " + this.naziv);
        System.out.println("Cena: " + this.vratiCenu());
    }
}
