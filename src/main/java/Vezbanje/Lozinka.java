package Vezbanje;

import java.util.Scanner;

public class Lozinka {
    public static void main(String[] args) {

//        Napisati program koji validira unos lozinke sve dok korisnik ne unese validnu.
//        Lozinka je validna ukoliko ima minimum 8 karaktera i sadrzi bar jedan od dva
//        specijalna karaktera a specijalni karakteri su @ i #

         Scanner s = new Scanner(System.in);
         boolean isRunning = true;

         while(isRunning){
             System.out.print("Unesite lozinku: ");
             String password = s.next();

             if(password.length() >= 8 && (password.contains("@") || password.contains("#"))){
                 isRunning = false;
             }else {
                 System.out.println("Lozinka nije validna.");
             }
         }
        System.out.println("Lozinka je validna");

    }
}
