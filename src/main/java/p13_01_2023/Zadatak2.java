package p13_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

//        Kreirati klasu Reakcija koja ima
//        tip reakcije (smajli, like, srce)
//        ime i prezime korisnika koji je reagovao
//        gettere, settere i konstruktore
//
//        Kreirati klasu FacebookPost koja ima:
//        ime i prezime korisnika koji je stavio oglas
//        tekst objave
//        niz reakcija
//        metodu reaguj, koja dodaje reakciju u niz
//        (modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje
//        na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom)
//        izbaciti prethodnu reakciju i uracunati novu.
//        Primer: Milan - lajkuje
//        Nemanja - lajkuje
//        Milan - daje srce

//        Post ima lajk od Nemanje i srce od Milana.
//        privatnu metodu koja vraca broj reakcija odredjenog tipa
//        (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//
//        brojReakcija(“smajli) => 3
//        brojReakcija(“srce”) => 2
//        brojReakcija(“like”) => 1
//        brojReakcija(“cry”) => 0
//
//
//        metodu stampaj koja stampa podatke u formatu:
//        ime i prezime
//        tekst objave
//        Smajli 10 | Like 15 | Srce 2


        FacebookPost f1 = new FacebookPost("Mika", "Hello");
        f1.reaguj(new Reakcija("srce", "Pera Peric"));
        f1.reaguj(new Reakcija("srce", "Zika Zikic"));
        f1.reaguj(new Reakcija("like", "Petar Petrovic"));
        f1.reaguj(new Reakcija("like", "Pera Peric"));
        f1.reaguj(new Reakcija("smajli", "Miki Mikic"));

        f1.stampaj();
    }
}
