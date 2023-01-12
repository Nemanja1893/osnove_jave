package p12_01_2023;

public class Ugovor {
    private String datumUgovora;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cenaNekretnine;
    private String adresaNekretnine;

    public Ugovor(String datumUgovora, FizickoLice prodavac, FizickoLice kupac){
        this.datumUgovora = datumUgovora;
        this.prodavac = prodavac;
        this.kupac = kupac;
    }

    public String getDatumUgovora() {
        return datumUgovora;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public double getCenaNekretnine() {
        return cenaNekretnine;
    }

    public String getAdresaNekretnine() {
        return adresaNekretnine;
    }

    public void setCenaNekretnine(double cenaNekretnine) {
        this.cenaNekretnine = cenaNekretnine;
    }

    public void setAdresaNekretnine(String adresaNekretnine) {
        this.adresaNekretnine = adresaNekretnine;
    }

    public double procenatZarade(){
        if(kupac.isJeKupovala()){
            return 0.02;
        }
        return 0.03;
    }
    public double zaradaAgencije(){
        return 1000.0 + cenaNekretnine * procenatZarade();
    }
    public void stampajUgovor(){
        System.out.println("Dana " + datumUgovora + " sklopljen je ugovor izmedju " + prodavac.getImeIPrezime());
        System.out.println("i " + kupac.getImeIPrezime() + " o kupovini nekretnine " + adresaNekretnine);
        System.out.println("po ceni od " + cenaNekretnine + " pri cemu je kupac u obavezi da agenciji isplati");
        System.out.println("novcanu vrednost u iznosu od " + zaradaAgencije());
    }
}
