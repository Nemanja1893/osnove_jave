package p19_01_2023;


import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

//    U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika)
//    zatim sabrati sve povrsine i obime i za svaku figuru ispisati ponaosob

        Pravougaonik p1 = new Pravougaonik(5,6);
        Pravougaonik p2 = new Pravougaonik(2,3);
        Pravougaonik p3 = new Pravougaonik( 10,20);
        JednakostranicniTrougao t1 = new JednakostranicniTrougao(5);
        JednakostranicniTrougao t2 = new JednakostranicniTrougao(8);

        ArrayList<Figura> figure = new ArrayList<>();

        figure.add(p1);
        figure.add(p2);
        figure.add(p3);
        figure.add(t1);
        figure.add(t2);

        double sumaO = 0;
        double sumaP = 0;

        for (int i = 0; i < figure.size(); i++) {
            sumaO = sumaO + figure.get(i).obim();
            sumaP = sumaP + figure.get(i).povrsina();
        }
        System.out.println("Ukupna povrsina: " + sumaP);
        System.out.println("Ukupni obim: " + sumaO);



    }


}
