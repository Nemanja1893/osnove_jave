package p10_01_2023;

public class Reziser {

    private String ime;
    private String prezime;
    private int starost;

    public Reziser(){

    }
    public Reziser(String ime, String prezime, int starost){
        this.ime = ime;
        this.prezime = prezime;
        this.starost = starost;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void stampaj(){
        System.out.println(ime + " " + prezime + ", starost " + starost + ".god");
    }
}
