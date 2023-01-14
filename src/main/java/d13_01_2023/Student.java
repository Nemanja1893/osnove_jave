package d13_01_2023;

import java.util.ArrayList;

public class Student {
    private int index;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student(int index, String imeIPrezime, String tipStudija) {
        this.index = index;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;

        this.ispiti = new ArrayList<>();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public String getTipStudija() {
        return tipStudija;
    }
    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }
    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispit){
        this.ispiti.add(ispit);
    }
    public double racunajProsek(){
        double suma = 0;
        int polozeni = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if(this.ispiti.get(i).polozenIspit()){
                suma = suma + this.ispiti.get(i).getOcena();
                polozeni++;
            }
        }
        return suma / polozeni;
    }
    public void stampaj(){
        System.out.println(this.index + " - " + this.imeIPrezime + " - " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).stampaj();
        }
        System.out.println("Prosecna ocena: " + this.racunajProsek());
    }



}
