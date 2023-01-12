package p12_01_2023;

public class FizickoLice {
    private String imeIPrezime;
    private String brojLk;
    private String jmbg;
    private boolean jeKupovala;

    public FizickoLice(String imeIPrezime, String brojLk, String jmbg){
        this.imeIPrezime = imeIPrezime;
        this.brojLk = brojLk;
        this.jmbg = jmbg;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getBrojLk() {
        return brojLk;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isJeKupovala() {
        return jeKupovala;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setJeKupovala(boolean jeKupovala) {
        this.jeKupovala = jeKupovala;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.brojLk);
    }
}
