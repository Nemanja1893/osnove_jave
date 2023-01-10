package p10_01_2023;

public class Zadatak3 {
    public static void main(String[] args) {

//        Kreirati klasu Film koja ima:
//        naziv filma
//        iz koje godine je film
//        konstruktore, gettere i settere
//        metodu print koja stampa podatke u formatu
//        naziv filma, godina
//
//
//        Kreirati klasu Reziser koja ima:
//        ime i prezime rezisera
//        starost
//        konstruktore, gettere i settere koji su potrebni
//        metodu print koja stampa podatke u formatu
//        ime prezime, starost.god
//
//        U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
        Reziser r = new Reziser("Quentin", "Tarantino", 59);
        Film f = new Film("Kill Bill", 2003, r);
        f.stampaj();


    }
}
