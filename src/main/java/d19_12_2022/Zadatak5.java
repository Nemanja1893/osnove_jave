package d19_12_2022;

import java.util.Random;
import java.util.Scanner;

public class Zadatak5
{
    public static void main(String[] args)
    {
//        Napisati program za ucenje matematike. Program daje korisniku 5 matematickih zadataka.
//        Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou korisniku se prikazuju
//        dva random broja koja treba da sabere i poruka o tacnosti resenja.
//        (Program generise random brojeve u opsegu od 0 do 50, ne unosi ih korisnik)

        Random random = new Random();
        Scanner s = new Scanner(System.in);

        int randomValue = 50;

        for (int i = 0; i < 5; i++)
        {

            int a = random.nextInt(randomValue);
            int b = random.nextInt(randomValue);
            int suma = a + b;

            System.out.print("Koliko je " + a + " + "  + b + "? " );

            int rez = s.nextInt();

            if(rez == suma)
            {
                System.out.println("Cestitam!");
            }
            else
            {
                System.out.println("Greska!");
            }

        }

    }
}
