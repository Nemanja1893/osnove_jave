package d13_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati klasu Student koja ima
//        broj indeksa
//        ime i prezime
//        tip studija (osnovne, master, doktorske)
//        niz ispita
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za indeks, ime i prezime, tip studija
//        getter za niz predmeta
//        metodu dodaj ispit u niz ispita
//        metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//        metodu stampaj koja stampa u formatu:
//        (broj indeksa) - (ime i prezime) - (tip studija)
//        Predmeti:
//        (naziv predmeta) - (profesor) - (ocena)
//                (naziv predmeta) - (profesor) - (ocena)
//                (naziv predmeta) - (profesor) - (ocena)
//                Prosecna ocena: (prosecna ocena)
//
//
//        Napisati klasu Ispit koja ima
//        naziv predmeta
//        ocenu (u rasponu od 5 do 10)
//        Ime i prezime profesora koji predaje predmet
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za sve atribute
//        metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//        metodu koja stampa ispit u formatu:
//        (naziv predmeta) - (profesor) - (ocena)

        Student student = new Student(785, "Nemanja Nikolic", "osnovne");
        student.dodajIspit(new Ispit("Matematika 2", 7, "Pera Peric"));
        student.dodajIspit(new Ispit("Hemija 3", 5, "Mika Mikic"));
        student.dodajIspit(new Ispit("Fizika 1", 6, "Pera Peric"));
        student.dodajIspit(new Ispit("Filozofija 1", 8, "Zika Zikic"));
        student.dodajIspit(new Ispit("Java 1", 10, "Nikola Nikolic"));

        student.stampaj();

    }
}
