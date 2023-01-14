package p13_01_2023;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojci;

    public Pasta(){
        this.sastojci = new ArrayList<>();
    }
    public void dodajSastojak(Sastojak sastojak){

        this.sastojci.add(sastojak);
    }

    private int cenaPaste(){
        int cena = 0;
        for (int i = 0; i < this.sastojci.size(); i++) {
            cena = cena + sastojci.get(i).getCena();
        }
        return cena;
    }
    public void stampaj(){
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < this.sastojci.size(); i++) {
            this.sastojci.get(i).stampaj();
        }
        System.out.println("Cena paste je " + cenaPaste() + " din.");
    }
    public void obrisiSastojak(String sastojak){

        for (int i = 0; i < this.sastojci.size(); i++) {
            if(this.sastojci.get(i).getNaziv().equals(sastojak)){
                this.sastojci.remove(i);
            }
        }
    }

}
