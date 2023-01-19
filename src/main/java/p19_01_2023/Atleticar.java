package p19_01_2023;

public abstract class Atleticar {
    private String ime;
    private String prezime;
    protected double rezultat;

    public Atleticar(String ime, String prezime, double rezultat) {
        this.ime = ime;
        this.prezime = prezime;
        this.rezultat = rezultat;
    }

    public abstract boolean kojiJeBolji(Atleticar atl);

    public void stampaj(){
        System.out.println(this.ime + " " + this.prezime + ", " + this.rezultat);
    }

}
