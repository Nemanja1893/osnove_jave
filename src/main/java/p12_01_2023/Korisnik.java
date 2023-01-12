package p12_01_2023;

public class Korisnik {
    private String ime;
    private String prezime;
    private String licenca;

    public Korisnik(){
        this.licenca = "basic";
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

    public String getLicenca() {
        return licenca;
    }

    public void pretplatiSe(int uplata){
        if(uplata == 100){
            licenca = "pro";
        } else if (uplata == 150) {
            licenca = "premium";
        }
    }
    public void ponistiPretplatu(){
        licenca = "basic";
    }
    public int maxDuzinaCalla(){

        if (licenca.equals("pro")) {
            return 240;
        } else if (licenca.equals("premium")) {
            return 1440;
        }
        return 40;
    }
    public void stampaj(){
        System.out.println(ime + " " + prezime);
    }

}
