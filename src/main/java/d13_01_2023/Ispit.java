package d13_01_2023;

public class Ispit {
    private String naziv;
    private int ocena;
    private String profesor;

    public Ispit(String naziv, int ocena, String profesor) {
        this.naziv = naziv;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public int getOcena() {
        return ocena;
    }
    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public boolean polozenIspit(){
//
        return this.ocena > 5 && this.ocena <= 10;
    }
    public void stampaj(){
        System.out.println(this.naziv + " - " + this.profesor + " - " + this.ocena);
    }
}

