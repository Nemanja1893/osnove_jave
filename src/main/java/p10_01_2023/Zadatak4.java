package p10_01_2023;

public class Zadatak4 {
    public static void main(String[] args) {
//        Kreirati klasu Korisnik koja ima
//        ime
//        prezime
//        gettere i settere za ime i prezime
//        konstuktore koje mislite da su vam potrebni
//        metoda koja stampa u formatu:
//        (ime) (prezime)
//
//                Kreirati klasu FacebookPost
//        opis
//        korisnik (referenca na korisnika koji je kreirao post)
//        konstrukore koje mislite da su vam potrebni
//        metoda print, stampa u formatu:
//        (ime) (prezime)
//                (opis post-a)
//
//        U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda
        Korisnik k = new Korisnik("Nemanja", "Nikolic");

        FacebookPost post1 = new FacebookPost("Hello", k);
        post1.stampaj();
    }
}
