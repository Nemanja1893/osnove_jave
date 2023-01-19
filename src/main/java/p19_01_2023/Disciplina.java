package p19_01_2023;

import java.util.ArrayList;

public class Disciplina {
    private String ime;
    private String tip;
    ArrayList<Atleticar> atleticari;

    public Disciplina(String ime, String tip) {
        this.ime = ime;
        this.tip = tip;
        this.atleticari = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void dodajAtleticara(Atleticar atl){
        atleticari.add(atl);
    }
//    public void diskvalifikuj(String ime, String prezime){
//        atleticari.
//    }
}
