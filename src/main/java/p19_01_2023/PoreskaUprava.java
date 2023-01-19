package p19_01_2023;

import java.util.ArrayList;

public class PoreskaUprava {
    private String grad;
    private ArrayList<Objekat> objekti;

    public PoreskaUprava(String grad) {
        this.grad = grad;
        this.objekti = new ArrayList<>();
    }
    public void dodajObjekat(Objekat o){
        this.objekti.add(o);
    }
    public Objekat najveciPorez(){
        double porez = 0;
        Objekat o = objekti.get(0);
        for (int i = 0; i < objekti.size(); i++) {
          if(porez < objekti.get(i).vratiPorez()){
              porez = objekti.get(i).vratiPorez();
              o = objekti.get(i);
          }
        }
        return o;
    }
    public Objekat najmanjiPorez(){
        double porez = 0;
        Objekat o = objekti.get(0);
        for (int i = 0; i < objekti.size(); i++) {
            if(objekti.get(i).vratiPorez() < porez){
                porez = objekti.get(i).vratiPorez();
                o = objekti.get(i);
            }
        }
        return o;
    }

    public double ukupanPorez(){
        double porez = 0;
        for (int i = 0; i < objekti.size(); i++) {
            porez = porez + objekti.get(i).vratiPorez();
        }
        return porez;
    }
    public void stampaj(){
        for (int i = 0; i < objekti.size(); i++) {
            objekti.get(i).stampaj();
        }
    }
}
