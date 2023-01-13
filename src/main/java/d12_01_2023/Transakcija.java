package d12_01_2023;

public class Transakcija {
    private String id;
    private Racun posiljalac;
    private Racun primalac;

    public Transakcija(String id, Racun posiljalac, Racun primalac) {
        this.id = id;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

    public String getId() {
        return id;
    }
    public Racun getPosiljalac() {
        return posiljalac;
    }
    public Racun getPrimalac() {
        return primalac;
    }
    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }
    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    private double provizija(double vrednostTrans){

        if(vrednostTrans < 4500){
            return 45;
        }
        return vrednostTrans * 0.01;

    }
    public void izvrsiTransakciju(double vrednostTrans){

        double sumaPosilj = vrednostTrans + provizija(vrednostTrans);
        double sumaPrim = posiljalac.getStanje() - provizija(vrednostTrans);
        if(sumaPrim <= 0){
            sumaPrim = 0;
        }

        if(this.posiljalac.getStanje() > sumaPosilj){
            this.posiljalac.novoStanje(this.posiljalac.getStanje() - sumaPosilj);
            this.primalac.novoStanje(this.primalac.getStanje() + vrednostTrans);
        } else{

            this.primalac.novoStanje(this.primalac.getStanje() + sumaPrim);
            this.posiljalac.novoStanje(0);

        }
    }
    public void stampaj(){
        System.out.println(this.id);
        System.out.println("Racun sa " + posiljalac.getImeIPrezime() + " - " + posiljalac.getBroj());
        System.out.println("Racun na " + primalac.getImeIPrezime() + " - " + primalac.getBroj());



    }
}
