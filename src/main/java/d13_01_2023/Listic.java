package d13_01_2023;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> kombinacije;

    public ArrayList<Kombinacija> getKombinacije() {
        return kombinacije;
    }

    public Listic(){
        this.kombinacije = new ArrayList<>();
    }
    public void dodajKombinaciju(Kombinacija kombinacija){

        this.kombinacije.add(kombinacija);

    }
    public boolean daLiJeDobitna(Kombinacija dobitnaKombinacija){
        for (int i = 0; i < this.kombinacije.size(); i++) {
            if(this.kombinacije.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)){
                return true;
            }
        }
        return false;
    }

    public void stampaj(){
        for (int i = 0; i < this.kombinacije.size(); i++) {
            this.kombinacije.get(i).stampaj();
        }
    }
}
