package d20_12_2022;

import java.util.Scanner;

public class Zadatak1
{
    public static void main(String[] args)
    {
//        Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje
//        apsolutnu vrednost sve dok se ne unese nula.

        Scanner s = new Scanner(System.in);
        int abs = 0;
        int broj = -1;
        boolean isRunning = true;

        while (isRunning)
        {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();

            if(broj < 0)
            {
                abs = -broj;
            }
            else if (broj > 0)
            {
                abs = broj;
            }
            else
            {
                isRunning = false;
                abs = 0;
            }
            if(abs != 0)
            {
                System.out.println("Apsolutna vrednost je " + abs);

            }
        }
        System.out.println(" ");
        System.out.println("Kraj programa jer je uneta nula");
    }
}
