package d13_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {




        Listic listic = new Listic();
        listic.dodajKombinaciju(new Kombinacija("da567", 1, 2,3,4,5,6,7));
        listic.dodajKombinaciju(new Kombinacija("da324", 10,20,30,15,9,8,22));
        listic.dodajKombinaciju(new Kombinacija("da324", 11,23,31,16,39,18,24));

        listic.stampaj();

        if(listic.daLiJeDobitna(new Kombinacija("dobitna", 1,2,3,4,5,6,7))){
            System.out.println("Dobitna kombinacija");
        }else{
            System.out.println("Nema dobitne kombinacije");
        }

    }
}
