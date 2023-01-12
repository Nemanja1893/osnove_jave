package p12_01_2023;

public class Zadatak3 {
    public static void main(String[] args) {

//        Kreirati klasu ViberKorisnik koja ima:
//        ime i prezime
//        broj telefona
//        da li je trenutno aktivan (boolean)
//        gettere, settere, konstuktore
//
//        Kreirati klasu ViberPoruka koja ima:
//        tekst poruke
//        vreme kad je poslata poruka
//        korisnika koji je poslao poruku
//        korisnika kome je poslata poruka
//        gettere i setere i konstuktore
//        rekaciju na poruku
//        metodu prikazi koja stampa podatke o poruci u formatu:
//        From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//        To: [Ime i prezime korisnika kome je poslata]
//        [Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
//
//        POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
//        if (this.reakcija != null)
//
//            Kreirati klasu ViberReakcija koja ima:
//        emoji (moze da bude sunglases, heart, smile, like ili sad)
//        korisnika koji je reagovao
//        U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.
        ViberKorisnik k1 = new ViberKorisnik("Pera Peric", "06844530", true);
        ViberKorisnik k2 = new ViberKorisnik("Mika Mikic", "06742146", false);
        ViberPoruka p1 = new ViberPoruka("Hello", "12.12.2022", k1, k2);
        ViberReakcija reakcija = new ViberReakcija("smile", k2);

        p1.setReakcija(reakcija);

        p1.stampaj();


    }
}
