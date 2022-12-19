package p19_12_2022;

import java.util.Scanner;

public class Zadatak3
{
    public static void main(String[] args)
    {
//        Napisati program koji pronalazi K-ti stepen broja N. Koristeci FOR petlju
//        K i N unosi korisnik.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite K: ");
        int k = s.nextInt();

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        int rez = 1;


        for (int i = 0; i < k; i++)
        {
            rez = rez * n;
        }
        System.out.println(rez);

    }
}
