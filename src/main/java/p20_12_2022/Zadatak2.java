package p20_12_2022;

import java.util.Scanner;

public class Zadatak2
{
    public static void main(String[] args)
    {

//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.

        Scanner s = new Scanner(System.in);

        int zeroCounter = 0;

        while (zeroCounter != 2)
        {
            System.out.print("Unesite broj: ");
            int unos = s.nextInt();

            if(unos == 0)
            {
                zeroCounter++;
            }

        }
        System.out.println("Kraj programa jer je uneto 2 nule");


    }
}
