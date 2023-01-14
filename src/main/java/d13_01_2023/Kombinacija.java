package d13_01_2023;

import java.util.ArrayList;

public class Kombinacija {
    private String id;
    private ArrayList<Integer> brojevi;
    int jedan;
    int dva;
    int tri;
    int cetri;
    int pet;
    int sest;
    int sedam;



    public Kombinacija(String id, int jedan, int dva, int tri, int cetri, int pet, int sest, int sedam) {
        this.id = id;
//        this.jedan = jedan;
//        this.dva = dva;
//        this.tri = tri;
//        this.cetri = cetri;
//        this.pet = pet;
//        this.sest = sest;
//        this.sedam = sedam;
        this.brojevi = new ArrayList<>();

        this.brojevi.add(jedan);
        this.brojevi.add(dva);
        this.brojevi.add(tri);
        this.brojevi.add(cetri);
        this.brojevi.add(pet);
        this.brojevi.add(sest);
        this.brojevi.add(sedam);

    }

    public ArrayList<Integer> getBrojevi() {
        return brojevi;
    }
    public boolean daLiJeIstaKombinacija(Kombinacija k){
        int counter = 0;
        for (int i = 0; i < this.brojevi.size(); i++) {
            if(this.brojevi.get(i) == k.brojevi.get(i)){
                counter++;
            }
        }
        return counter == 7;
    }

    public void stampaj(){
        System.out.println("ID: " + this.id);
        System.out.println("Brojevi " );
        for (int i = 0; i < this.brojevi.size(); i++) {
            System.out.print(this.brojevi.get(i) + ", ");

        }
        System.out.println(" ");
        System.out.println("---------------------------------------");
    }
}
