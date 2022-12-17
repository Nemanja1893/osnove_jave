package d16_12_2022;

import java.util.Scanner;

public class Zadatak4
{
    public static void main(String[] args)
    {
//        Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dimenziju tabele: ");
        int dimTabele = s.nextInt();

        int iterations = dimTabele * dimTabele;

        for (int i = 0; i < iterations ; i++)
        {
            if((i + 1) % dimTabele == 0)
            {
                System.out.print("_|");
                System.out.println(" ");
            }
            else
            {
                System.out.print("_|");
            }

        }

    }
}
