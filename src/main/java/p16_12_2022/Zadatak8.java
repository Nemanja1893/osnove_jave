package p16_12_2022;

import java.util.Scanner;

public class Zadatak8
{
    public static void main(String[] args)
    {
//          Napisati program koji stampa 20 pozicija.
//          Za aktivnu poziciju stampa *
//          Za neaktivnu pozciju stampa _
//	        Korisnik unosi granice za nekativni opseg, unoseci A i B.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite A: ");
        int a = s.nextInt();

        System.out.println("Unesite B: ");
        int b = s.nextInt();

        for (int i = 1; i <= 20; i++)
        {
            if(i >= a && i <= b)
            {
                System.out.print("_ ");
            }
            else
            {
                System.out.print("* ");
            }
        }

    }
}
