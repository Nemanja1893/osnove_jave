package d16_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu Osoba koja ima:
//        ime i prezime
//        jmbg
//        godinu rodjenja
//        default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere
//        metodu stampaj koja stampa u formatu:
//        (ime i prezime), (jmbg), (godina rodjenja)
//
//        Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//        broj (broj koji igrac nosi)
//        poziciju koju igra (odbrambeni, napadac, … )
//        kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//        default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere za broj, kapiten i poziciju
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//        Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//        godine iskustva
//        tip trenera (kondicioni, za igru, pomocni, personalni)
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//        U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

        Trener t1 = new Trener("Pera Peric",
                                "231421312",
                                1995,
                                5,
                                "kondicioni");

        Igrac i1 = new Igrac("Zika Zikic",
                                "23132141241",
                                2001,
                                15,
                                "stoper",
                                false);

        Karton k1 = new Karton("zuti");
        Karton k2 = new Karton("crveni");

        i1.dodajKarton(k1);
        i1.dodajKarton(k2);
        i1.dodajKarton(k1);
        i1.dodajKarton(k1);

        t1.stampajTrenera();
        i1.stampajIgraca();
    }
}
