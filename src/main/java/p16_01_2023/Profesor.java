package p16_01_2023;

public class Profesor extends Osoba {
    private String predmet;
    private double plata;

    public Profesor(String ime, String jmbg, String predmet, int plata){
        super(ime, jmbg);
        this.predmet = predmet;
        this.plata = plata;
    }
    public void povecajPlatu(double procenat){
        double p = this.plata * (procenat / 100);
        this.plata = this.plata + p;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Predaje: " + this.predmet);
        System.out.println("Plata " + this.plata);
    }
}
