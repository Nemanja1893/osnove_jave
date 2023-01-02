package PrviJavaTest;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji pruza mogucnost postavljanja lozinke.
//        Korisnik prvo unosi lozinku a zatim program od korisnika zahteva unos
//        kojim potvrdjuje lozinku sve dok se ne poklopi sa lozinkom ili dok mu se ne
//        blokira mogucnost postavljanja lozinke. Korisnik moze maksimalno 3 puta da pogresi potvrdu lozinke.
//
//        Ukoliko se lozinke ne poklapaju ispisati gresku “Lozinke se ne poklapaju”
//        Ukoliko korisnik unese pogresno potvrdu lozinke vise od 3 puta, ispisati poruku “Mogucnost postavljanja lozinke je blokirana”
//        Ukoliko se lozinke poklapaju ispisati “Lozinka je uspesno postavljena”

        Scanner s = new Scanner(System.in);

        int passCounter = 0;
        boolean isRunning = true;

        System.out.print("Unesite lozinku: ");
        String lozinka = s.next();

        while (isRunning){
            System.out.print("Potvrdite lozinku: ");
            String potvrda = s.next();

            if(!potvrda.equals(lozinka)){
                System.out.println("Lozinke se ne poklapaju");
                passCounter++;
            }
            else {
                System.out.println("Lozinka je uspesno postavljena");
                isRunning = false;
            }

            if(passCounter > 3){
                System.out.println("Mogucnost za postavljanje lozinke je blokirana");
                isRunning = false;
            }

        }


    }
}
