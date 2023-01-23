package Vezbanje.Planinar;

import java.sql.SQLOutput;

public class PlaninarMain {
    public static void main(String[] args) {
//        Kreirati klasu ​Planina ​koja od privatnih atributa ima:
//        ime planine
//        naziv države u kojoj se nalazi
//        visinu planine.
//        a od javnih metoda:
//        default-ni konstruktor i konstuktor koji postavlja sve parametre
//        gettere i settere za sve atribute
//
//        (15 poena) Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima:
//        jedinstveni celobrojni identifikacioni broj
//        ime i prezime
//        Dok od javnih metoda:
//        konstruktor koji postavlja sve atribute klase.
//        gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj.
//        posle njihovog postavljanja u konstruktoru)
//        apstraktnu metodu štampaj
//        apstraktnu metodu koja vraca clanarinu planinara
//        apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar
//        upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina.
//        (20 poena) Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar.
//        Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru:
//        težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
//        naziv okruga odakle je rekreativni planinar.
//        maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//        da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji
//        od visine planine, s tim da oprema dodatno otežava penjanje i
//        za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
//        rekeativci placaju clanarinu u iznosu od 1000 rsd
//        metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//        Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug)
//        (20 poena) Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar.
//        Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost)
//        i poeni se mogu menjati. Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu
//        u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
//        Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)
//
//                (25 poena) Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute:
//        naziv doma
//        godinu kada je osnovan.
//        članove doma koji su planinari (klasa vodi računa o nizu)
//        Dok od javnih:
//        default-ni konstuktor i konstuktor koji postavlja sve parametre
//        gettere i settere koji su potrebni
//        metodu učlani planinara, koja dodaje planinara u niz
//        metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu
//        (metoda za parametar prima Planinu za koju se proverava informacija)
//        metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
//        metodu koja štampa podatke o domu i o svim članovima doma
//        metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
//                (10 poena) U glavnom programu kreirati jedan planinarski dom, i
//                u njemu učlaniti nekoliko rekreativnih planinara i nekoliko alpinista
//                (minimum po 3), i istestirati svaku od metoda.

        Planina p1 = new Planina("Stara Planina", "Srbija", 2376);

        Alpinista a1 = new Alpinista(1234, "Nemanja Nikolic", 6);
        Alpinista a2 = new Alpinista(1589, "Pera Peric", 3);
        Alpinista a3 = new Alpinista(9865, "Zika Zikic", 2);

        RekreativniPlaninar r1 = new RekreativniPlaninar(5685, "Mika Mikic",
                                                4, "Pcinjski", 1895);
        RekreativniPlaninar r2 = new RekreativniPlaninar(2568, "Petar Petric",
                                               1, "Sremski", 2534);
        RekreativniPlaninar r3 = new RekreativniPlaninar(5556, "Bojan Bojanic",
                                                4, "Nisavski", 2015);

        PlaninarskiDom pd = new PlaninarskiDom("Sasvim Prirodno", 1925);
        pd.uclaniPlaninara(a1);
        pd.uclaniPlaninara(a2);
        pd.uclaniPlaninara(a3);
        pd.uclaniPlaninara(r1);
        pd.uclaniPlaninara(r2);
        pd.uclaniPlaninara(r3);

        pd.isclaniPlaninara(5556);

        pd.stampaj();

        System.out.println("Uspenso se popelo " + pd.brojUspesnih(p1) + " planinara");
        System.out.println("Ukupan mesecni prihod: " + pd.mesecniPrihod());




    }
}
