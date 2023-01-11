package d10_01_2023;

import p10_01_2023.ClanskaKarta;
import p10_01_2023.Kupac;
import p10_01_2023.Proizvod;

public class Zadatak2 {
    public static void main(String[] args) {

//        Kreirati klasu Proizvod koja ima
//        Naziv proizvoda
//        kupca/musteriju
//        cenu izrade proizvoda
//        gettere i settere
//        konstruktore

//        Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//        cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//        Metodu za stampanje proizvoda u formatu:
//        naziv proizvoda - cena
//        ime i prezime - broj kartice
//
//        Kreirati klasu Kupac koja ima:
//        ime i prezime
//        clansku kartu
//        gettere i settere, clanska karta ne moze da se menja
//        konstruktore
//        metodu stampaj koja stampa u formatu
//        ime i prezime - broj kartice
//
//        Kreirati klasu ClanskaKarta koja ima:
//        popust (u rasponu od 5 do 10 %)
//        broj kartice (npr: 9329-0239)
//        gettere i settere
//        konstuktore

        ClanskaKarta kartica = new ClanskaKarta(10, "156355");
        Kupac kupac = new Kupac("Nemanja Nikolic", kartica);
        Proizvod p1 = new Proizvod("TV", kupac, 325);
        p1.stampaj();

    }
}
