package d19_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//        Kreirati abstraktnu klasu Ambalaza koja ima:
//        barkod (primer: 328232-2823)
//        naziv artikla
//        neto tezinu
//        bruto tezinu
//        konstuktore (default-ni i sa parametrima)
//        gettere i settere
//        metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//                abstraktnu metodu koja vraca cenu artikla
//        abstraktnu metodu stampaj
//
//        Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//        atribut koji kaze da li se moze reciklirati
//        osnovna cena
//        gettere i setter za atribute
//        konstuktori koji su vam potrebni
//        racuna cenu tako da ispunjava uslova:
//        ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//        ako nije u cenu ulazi samo osnovna cena
//        metoda stampaj stampa sve podatke iz klase tetrapak.
//
//        Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//        kaucija za flasu
//        atribut koji kaze da li se za flasu placa kaucija
//        osnovna cena
//        gettere i setter za atribute
//        konstuktori koji su vam potrebni
//        racuna cenu
//        ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//        ako se ne placa, (osnovna cena) * 1.2
//        metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//                Kreirati klasu SuperKartica koja ima:
//        broj kartice
//        ime i prezime vlasnika
//        popust (200, 500, … )
//        konstuktore (default-ni i sa parametrima)
//        gettere i settere
//        metodu stampaj koja stampa karticu u formatu:
//        (broj kartice), (ime i prezime)
//
//
//        Kreirati klasu Korpa koja ima:
//        niz ambalaza
//        metodu dodaj ambalazu
//        metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//        privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//        metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar
//        funkcije se prima Super karticu iz koje se cita popust.
//
//        U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih
//        tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

        Korpa k = new Korpa();
        Tetrapak t1 = new Tetrapak("165764", "mleko", 50,120,
                                     true, 70);
        StaklenaAmbalaza s1 = new StaklenaAmbalaza("554964", "pivo", 50,80,
                                                    50,true);
        Tetrapak t2 = new Tetrapak("1892764", "sok", 60,115,
                                     false, 60);
        StaklenaAmbalaza s2 = new StaklenaAmbalaza("9685964", "voda", 90,45,
                                                     25,false);

        k.dodajAmbalazu(t1);
        k.dodajAmbalazu(t2);
        k.dodajAmbalazu(s1);
        k.dodajAmbalazu(s2);

        k.izbaciAmbalazu(s1.getBarKod());


        t1.stampaj();
        t2.stampaj();
        s1.stampaj();
        s2.stampaj();

        SuperKartica sk = new SuperKartica(1145, "Nemanja Nikolic", 5);

        sk.stampaj();
        System.out.println("Ukupna cena korpe sa popustom: " + k.cenaKorpe(sk));



    }
}
