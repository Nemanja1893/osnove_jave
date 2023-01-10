package p10_01_2023;

public class Radnik {
    private String jmbg;
    private String ime;
    private String prezime;
    private int brojDece;
    private int strucnaSprema;
    private int godineStaza;

    public String getJmbg() {
        return jmbg;
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

    public int getBrojDece() {
        return brojDece;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public int getStrucnaSprema() {
        return strucnaSprema;
    }

    public void setStrucnaSprema(int strucnaSprema) {
        this.strucnaSprema = strucnaSprema;
    }

    public int getGodineStaza() {
        return godineStaza;
    }

    public void setGodineStaza(int godineStaza) {
        this.godineStaza = godineStaza;
    }



    public Radnik(String jmbg){
        this.jmbg = jmbg;
    }
    public Radnik(String jmbg, String ime, String prezime, int brojDece, int strucnaSprema, int godineStaza){
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.brojDece = brojDece;
        this.strucnaSprema = strucnaSprema;
        this.godineStaza = godineStaza;
    }
    public double minuliRad(){
        if(godineStaza <= 10 && godineStaza > 0){
            return godineStaza * 0.05;
        }else if (godineStaza > 10 && godineStaza <20) {
            return  godineStaza * 0.075;
        } else if (godineStaza > 20) {
            return godineStaza * 0.1;
        }
        return 0;
    }
    public double plataRadnika(){

        return 25000 + (koeficijenatSlozenosti() + minuliRad()) * 10000;
    }
    public int koeficijenatSlozenosti(){
        return strucnaSprema * brojDece;
    }
    public boolean jeKreditnoSposoban(){
        if(plataRadnika() > 50000){
            return true;
        }
        return false;
    }
}
