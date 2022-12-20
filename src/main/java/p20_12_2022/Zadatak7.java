package p20_12_2022;

import java.util.Scanner;

public class Zadatak7
{
    public static void main(String[] args)
    {
//        Napisati program koji sabira brojeve koje korisnik unosi,
//        pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.

        Scanner s = new Scanner(System.in);

        int suma = 0;
        int lastSum = 0;

        while (suma <= 100)
        {
            lastSum = suma;
            System.out.print("Unesite vrednost: ");
            int unos = s.nextInt();

            suma = suma + unos;

        }
        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + lastSum);




    }
}
