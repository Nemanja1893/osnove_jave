package p10_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//        Za klasu Tacka, koja ima privatne atribute:
//        x - x koordinata
//        y - y koordinata
//        Javne metode:
//        metodu stampaj
//        imamo difoltni konstruktor
//        imamo konstuktor koji prima obe koordinate za kreiranje objekta
//        geter za x
//        geter za y
//        seter za x
//        seter za y
//
//        U glavnom programu kreirati dva objekta:
//        Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//        Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40

        Tacka t1 = new Tacka();
        t1.setX(10);
        t1.setY(20);
        t1.stampaj();

        Tacka t2 = new Tacka(30,40);
        t2.stampaj();
    }
}
