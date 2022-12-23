package d20_12_2022;

import java.util.Scanner;

public class Zadatak2
{
    public static void main(String[] args)
    {
//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu
//        ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..

        Scanner s = new Scanner(System.in);

        String rimski = " ";
        int arapski = 0;
        boolean isRunning = true;
        boolean isWrong;

        while (isRunning)
        {
            System.out.print("Unesite rimski broj: ");
            rimski = s.next();

            isWrong = false;

            if(rimski.equals("I"))
            {
                arapski = 1;
            }
            else if (rimski.equals("V"))
            {
                arapski = 5;
            }
            else if (rimski.equals("X"))
            {
                arapski = 10;
            }
            else if (rimski.equals("L"))
            {
                arapski = 50;
            }
            else if (rimski.equals("C"))
            {
                arapski = 100;
            }
            else if (rimski.equals("D"))
            {
                arapski = 500;
            }
            else if (rimski.equals("M"))
            {
                arapski = 1000;
            }
            else if (rimski.equals("KRAJ"))
            {
                isRunning = false;
                isWrong = true;

            }
            else
            {
                System.out.println("Pogresan unos");
                isWrong = true;
            }

            if(!isWrong)
            {
                System.out.println("Arapski: " + arapski);

            }


        }
        System.out.println("Kraj programa");

    }
}
