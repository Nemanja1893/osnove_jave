package p16_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//        Kreirati klasu Osoba koja od atributa ima:
//        ime i prezime
//        jmbg
//        konstuktor sa parametrima
//        metodu stampaj koja stampa podatke u formatu
//        ime prezime, jmbg
//
//
//        Kreirati klasu Student koja nasledjuje klasu Osoba,
//        koja od dodatnih atributa ima:
//        broj indeksa
//        dug za skolarinu
//        konstuktor sa parametrima
//        metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//                Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//        Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//                koja od dodatnih atributa ima:
//        naziv predmeta koji predaje
//        iznos plate
//        konstuktor sa parametrima
//        metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//        Napisati metodu stampajProfu da stampa sve podatke o profesoru

        Profesor p = new Profesor("Pera Peric", "12161684646", "Uvod", 500);
        p.povecajPlatu(10);
        p.stampaj();

        Student s = new Student("Zika Zikic", "125688756", 266, 255);
        s.uplatiSkolarinu(100);
        s.stampaj();

    }
}
