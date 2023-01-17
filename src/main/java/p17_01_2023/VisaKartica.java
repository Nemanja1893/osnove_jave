package p17_01_2023;

public class VisaKartica extends PlatnaKartica {

    private String ovlascenoLice;

    public VisaKartica(String ovlascenoLice, double suma, String broj, int godinaVazenja, int mesecVazenje){
        super(suma, broj, godinaVazenja, mesecVazenje);
        this.ovlascenoLice = ovlascenoLice;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(double vrednost){
        double vrednostSaProv = vrednost + (vrednost * 0.018);
        double provizija = vrednostSaProv - vrednost;

        if(provizija < 4){
            provizija = 4;
        }

        this.suma -= vrednost + provizija;

    }
    @Override
    public void stampaj(){
        System.out.println("Visa: ");
        System.out.println(this.ovlascenoLice);
        System.out.println(this.broj + ", " + this.mesecVazenja + "/"
                + this.godinaVazenja + ", " + this.suma);
    }
}
