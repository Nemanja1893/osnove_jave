package p20_12_2022;

import java.util.Scanner;

public class Zadatak3
{
    public static void main(String[] args)
    {
//        Napisati program koji od korisnika ucitava brojeve sve
//        dok ne unesu makar po jedan broj od 1 do 4.

        Scanner s = new Scanner(System.in);

        int counter1 = 1;
        int counter2 = 1;
        int counter3 = 1;
        int counter4 = 1;

        while (!(counter1 <= 0 && counter2 <= 0 && counter3 <= 0 && counter4 <= 0))
        {
            System.out.println("Unesite broj:");
            int broj = s.nextInt();

            if(broj == 1)
            {
                counter1--;
            }
            else if (broj == 2)
            {
                counter2--;
            }
            else if (broj == 3)
            {
                counter3--;
            }
            else if (broj == 4)
            {
                counter4--;
            }

        }
        System.out.println("Kraj programa");

    }
}
