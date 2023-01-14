package p13_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//        Kreirati klasu Sastojak koja ima:
//        naziv
//        cenu
//        gettere i settere
//        konstruktore
//        metodu za stampanje koja stampa  podatke u formatu:
//        naziv - cena.din
//
//        Kreirati klasu Pasta koja ima:
//        niz sastojaka
//        metodu za dodavanje sastojka
//        defaultni konstruktor
//        metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//        metodu za stampu koja stampa podatke u formatu:
//        Pasta je sa sastojcima:
//        naziv - cena.din
//        naziv - cena.din
//        naziv - cena.din
//        Cena paste je cena.din
//
//
//                (ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.

        Sastojak s1 = new Sastojak("sos", 200);
        Sastojak s2 = new Sastojak("piletina", 300);
        Sastojak s3 = new Sastojak("slanina", 250);

        Pasta p1 = new Pasta();
        p1.dodajSastojak(s1);
        p1.dodajSastojak(s2);
        p1.dodajSastojak(s3);


        p1.obrisiSastojak("sos");


        p1.stampaj();
    }
}
