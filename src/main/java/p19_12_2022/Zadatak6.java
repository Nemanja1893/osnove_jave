package p19_12_2022;

import java.util.Scanner;

public class Zadatak6
{
    public static void main(String[] args)
    {
//        Napisati program koji od korisnika ucitava N brojeva  i
//        ispisuje koliko je parnih brojeva uneo korisnik.
//        N nam kaze koliko broja ce korisnik da unese.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        int parni = 0;

        for (int i = 0; i < n; i++)
        {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if(broj % 2 == 0)
            {
                parni++;
            }
        }
        System.out.println("Uneto je " + parni + " parna broja");
    }
}
