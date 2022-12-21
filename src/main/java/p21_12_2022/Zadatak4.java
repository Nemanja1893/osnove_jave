package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4
{
    public static void main(String[] args)
    {
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
//        i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(5);
        brojevi.add(8);

        System.out.print("Unesite poziciju: ");
        int k = s.nextInt();

        System.out.println("Na poziciji " + k + " je vrednost " + brojevi.get(k) + ".");

    }
}
