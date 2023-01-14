package p13_01_2023;

public class Reakcija {
    private String tip;
    private  String imeIPrezimeKorisnika;

    public Reakcija(String tip, String imeIPrezimeKorisnika) {
        this.tip = tip;
        this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
    }


    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
    public String getImeIPrezimeKorisnika() {
        return imeIPrezimeKorisnika;
    }
    public void setImeIPrezimeKorisnika(String imeIPrezimeKorisnika) {
        this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
    }
}
