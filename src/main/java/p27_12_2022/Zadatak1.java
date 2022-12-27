package p27_12_2022;

import java.util.Scanner;

public class Zadatak1
{
    public static void main(String[] args)
    {

//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//        Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun.
//        Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.

        Scanner s = new Scanner(System.in);


        Racun prviRacun = new Racun();
        prviRacun.broj = "12136464";
        prviRacun.imeIPrezime = "Nemanja Nikolic";
        prviRacun.stanje = 1500;

        Racun drugiRacun = new Racun();
        drugiRacun.broj = "955866253";
        drugiRacun.imeIPrezime = "Petar Petrovic";
        drugiRacun.stanje = 3000;

//        System.out.print(prviRacun.brojRacuna + ", " + prviRacun.imeIPrezime
//                                                    + ", " + prviRacun.stanjeNaRacunu);
//
//        System.out.println("  ");
//
//        System.out.print(drugiRacun.brojRacuna + ", " + drugiRacun.imeIPrezime
//                                                  + ", " + drugiRacun.stanjeNaRacunu);

        System.out.println("Posiljalac: " + prviRacun.imeIPrezime + ", " + prviRacun.broj + ", stanje: "
                + prviRacun.stanje);
        System.out.println("Primalac: " + drugiRacun.imeIPrezime + ", " + drugiRacun.broj + ", stanje: "
                + drugiRacun.stanje);

        System.out.println("Unesite sumu za transakciju ");
        int suma = s.nextInt();

        prviRacun.stanje = prviRacun.stanje - suma;
        drugiRacun.stanje = drugiRacun.stanje + suma;

        System.out.println("Stanje nakon transakcije");

        System.out.println("Posiljalac: " + prviRacun.imeIPrezime + ", " + prviRacun.broj + ", stanje: "
                + prviRacun.stanje);
        System.out.println("Primalac: " + drugiRacun.imeIPrezime + ", " + drugiRacun.broj + ", stanje: "
                + drugiRacun.stanje);



    }
}
