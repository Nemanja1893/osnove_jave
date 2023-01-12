package p12_01_2023;

public class ViberKorisnik {
    private String imeIPrezime;
    private String brojTelefona;
    private boolean jeAktivan;

    public ViberKorisnik(String imeIPrezime, String brojTelefona, boolean jeAktivan){
        this.imeIPrezime = imeIPrezime;
        this.brojTelefona = brojTelefona;
        this.jeAktivan = jeAktivan;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public boolean isJeAktivan() {
        return jeAktivan;
    }

    public String aktivanIliNe(){
        if(jeAktivan){
            return "Active now";
        }
        return "Not Active now";
    }

}
