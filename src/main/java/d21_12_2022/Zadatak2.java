package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2
{
    public static void main(String[] args)
    {
//        Napisati program koji ucitava N brojeva i smesta ih u niz.
//        Zatim, iz niza, broji koliko je parnih brojeva uneto.
//        Brojeve unosi korisnik.

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        int evenCounter = 0;

        for (int i = 0; i < n; i++)
        {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            brojevi.add(i, broj);

        }
        for (int i = 0; i < brojevi.size(); i++)
        {
            if(brojevi.get(i) % 2 == 0)
            {
                evenCounter++;
            }
        }
        System.out.println("U nizu ima " + evenCounter + " parna broja.");

    }
}
