package d20_12_2022;

import java.util.Scanner;

public class Zadatak3
{
    public static void main(String[] args)
    {
//        Napisati program koji od korisnika ucitava brojeve
//        sve dok ne unesu bar dve dvojke ili tri jedinice.

        Scanner s = new Scanner(System.in);

        int onesCounter = 0;
        int twosCounter = 0;
        boolean isRuinning = true;

        while (isRuinning)
        {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            if(broj == 2)
            {
                twosCounter++;
            }
            else if (broj == 1)
            {
                 onesCounter++;
            }
            if(twosCounter >= 2 || onesCounter >= 3)
            {
                isRuinning = false;
            }

        }
        System.out.println("Kraj programa.");
    }
}
