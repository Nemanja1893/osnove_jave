package d10_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu Autor koja ima
//        -ime i prezime
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu:
//        (ime autora) (prezime autora)
//
//        Kreirati klasu Knjiga koji ima:
//        -ISBN
//        -naziv
//        -godina izdanja
//        -autor
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//        (ISBN)
//        (naziv) - (godina izdanja)
//        autor: (ime autora) (prezime autora)
//
//        U glavnom programu napraviti vise autora sa vise knjiga.

        Autor a1 = new Autor("J.R.R", "Tolkien");
        Knjiga lotr = new Knjiga("23144-411", "Return of the King", 1954, a1);
        lotr.stampaj();

        Autor a2 = new Autor();
        a2.setIme("Umberto");
        a2.setPrezime("Eco");

        Knjiga imeRuze = new Knjiga("2313-1231-45k");
        imeRuze.setNaziv("The name of the rose");
        imeRuze.setGodinaIzdanja(1980);
        imeRuze.setAutor(a2);

        imeRuze.stampaj();
    }
}
