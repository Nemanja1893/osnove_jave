package p19_12_2022;

import java.util.Scanner;

public class Zadatak7
{
    public static void main(String[] args)
    {

//        Napisati program koji od korisnika ucitava N brojeva i na kraju ispisuje
//        srednju vrednost svih brojeva.



        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        int avg;
        int suma = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            suma = suma + broj;

        }

        avg = suma / n;

        System.out.println("Srednja vrednost je " + avg);
    }
}
