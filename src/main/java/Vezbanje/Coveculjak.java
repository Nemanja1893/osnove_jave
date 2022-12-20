package Vezbanje;

import java.util.Scanner;

public class Coveculjak
{
    public static void main(String[] args)
    {
//        Napisati program koji iscrtava coveculjka C na tabli dimenzija 5x5.
//        Korisnik unosi poziciju coveculjka. Pozicije u tabeli su kao sa slike.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite poziciju coveculjka: ");
        int c = s.nextInt();

        int tableSize = 5;
        int iterations = tableSize * tableSize;

        for (int i = 0; i < iterations; i++)
        {
            if(i != c)
            {
                if((i + 1) % tableSize == 0)
                {
                    System.out.print("   |");
                    System.out.println(" ");
                }
                else
                {
                    System.out.print("   |");
                }
            }
            else if ((i + 1) % tableSize == 0)
            {
                System.out.print(" C |");
                System.out.println(" ");
            }
            else
            {
                System.out.print(" C |");
            }



       }

    }
}
