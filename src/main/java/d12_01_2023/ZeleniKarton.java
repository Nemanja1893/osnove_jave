package d12_01_2023;

public class ZeleniKarton {
    private String imeIPrezimeStud;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String imeIprezimeProf;
    private int ocena;

    public ZeleniKarton(String imeIPrezimeStud, int brojIndeksa, String nazivPredmeta,
                        String imeIprezimeProf, int ocena) {
        this.imeIPrezimeStud = imeIPrezimeStud;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeIprezimeProf = imeIprezimeProf;
        this.ocena = ocena;
    }

    public String getImeIPrezimeStud() {
        return imeIPrezimeStud;
    }
    public int getBrojIndeksa() {
        return brojIndeksa;
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public String getImeIprezimeProf() {
        return imeIprezimeProf;
    }
    public int getOcena() {
        return ocena;
    }
    public void setImeIPrezimeStud(String imeIPrezimeStud) {
        this.imeIPrezimeStud = imeIPrezimeStud;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    public void setImeIprezimeProf(String imeIprezimeProf) {
        this.imeIprezimeProf = imeIprezimeProf;
    }
    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean polozenIspit(){
        if(this.ocena > 5){
            return true;
        }
        return false;
    }
    public void stampaj(){
        System.out.println("Student: " + this.imeIPrezimeStud + ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.imeIprezimeProf);
    }
}
