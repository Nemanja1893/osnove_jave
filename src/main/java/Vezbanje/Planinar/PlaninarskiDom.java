package Vezbanje.Planinar;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String naziv;
    private int godOsnivanja;
    ArrayList<Planinar> planinari;
    public PlaninarskiDom(){

    }
    public PlaninarskiDom(String naziv, int godOsnivanja) {
        this.naziv = naziv;
        this.godOsnivanja = godOsnivanja;
        planinari = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public int getGodOsnivanja() {
        return godOsnivanja;
    }
    public void setGodOsnivanja(int godOsnivanja) {
        this.godOsnivanja = godOsnivanja;
    }

    public void uclaniPlaninara(Planinar p){
        planinari.add(p);
    }
    public void isclaniPlaninara(int id){
        for (int i = 0; i < planinari.size(); i++) {
            if(planinari.get(i).getId() == id){
                planinari.remove(i);
            }
        }
    }
    public int brojUspesnih(Planina p){
        int counter = 0;
        for (int i = 0; i < planinari.size(); i++) {
            if(planinari.get(i).uspesanUspon(p)){
                counter++;
            }
        }
        return counter;
    }
    public int mesecniPrihod(){
        int suma = 0;
        for (int i = 0; i < planinari.size(); i++) {
            suma += planinari.get(i).vratiClanarinu();
        }
        return suma;
    }
    public void stampaj(){
        System.out.println("Planinarski dom: " + this.naziv);
        System.out.println("Osnovan: " + this.godOsnivanja);
        System.out.println("Clanovi");
        for (int i = 0; i < planinari.size(); i++) {
            planinari.get(i).stampaj();
        }
    }

}
