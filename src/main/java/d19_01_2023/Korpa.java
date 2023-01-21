package d19_01_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze;
    public Korpa(){
        ambalaze = new ArrayList<>();
    }
    public void dodajAmbalazu(Ambalaza a){
        ambalaze.add(a);
    }
    public void izbaciAmbalazu(String kod){
        for (int i = 0; i < ambalaze.size(); i++) {
            if(ambalaze.get(i).getBarKod().equals(kod)){
                ambalaze.remove(i);
            }
        }
    }
    private double cenaSvihAmbalaza(double popust){
        double suma = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            suma += ambalaze.get(i).vratiCenu() - popust;
        }
        return suma;
    }
    public double cenaKorpe(SuperKartica sk){
        double popust = sk.getPopst();
        return this.cenaSvihAmbalaza(popust);
    }
}
