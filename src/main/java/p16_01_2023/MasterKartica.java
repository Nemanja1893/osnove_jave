package p16_01_2023;

public class MasterKartica extends PlatnaKartica{
    public MasterKartica(double suma, String broj, int godinaVazenja, int mesecVazenja) {
        super(suma, broj, godinaVazenja, mesecVazenja);
    }
    @Override
    public void izvrsiTransakciju(double vrednost){

        double vrednostSaProv = vrednost + (vrednost * 0.015);
        super.izvrsiTransakciju(vrednostSaProv);
    }
    public void naplatiOdrzavanje(){
        this.suma -= 2;
    }
    @Override
    public void stampaj(){
        System.out.println("Master: ");
        super.stampaj();
    }
}
