package p10_01_2023;

public class Film {
    private String naziv;
    private int godina;

    private Reziser reziserFilma;
    public Film(){

    }
    public Film(String naziv, int godina, Reziser reziser){
        this.naziv = naziv;
        this.godina = godina;
        this.reziserFilma = reziser;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public Reziser getReziserFilma() {
        return reziserFilma;
    }

    public void setReziserFilma(Reziser reziserFilma) {
        this.reziserFilma = reziserFilma;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void stampaj(){
        System.out.println(naziv + ", " + godina);
        System.out.println("Rezirao je: " + reziserFilma.getIme() + " " + reziserFilma.getPrezime());

    }
}
