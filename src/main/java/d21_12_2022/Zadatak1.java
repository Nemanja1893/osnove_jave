package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1
{
    public static void main(String[] args)
    {
//        Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
//        i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);
        brojevi.add(60);
        brojevi.add(70);
        brojevi.add(80);
        brojevi.add(90);
        brojevi.add(100);

        System.out.print("Unesite poziciju od 0 do 9: ");
        int k = s.nextInt();

        System.out.print("Unesite novu vrednost: ");
        int novaVrednost = s.nextInt();

        brojevi.set(k, novaVrednost);

        System.out.println("Na poziciji " + k + " je sada " + brojevi.get(k));



            



    }
}
