package d20_12_2022;

import java.util.Scanner;

public class Zadatak4
{
    public static void main(String[] args)
    {
//        Napisati program koji proverava uparenost zagrada.
//        Korisnik unosi matematicku formulu sve dok ne unese znak =.
//        Korisnik unosi svaki karakter jednacine posebno
//        i na kraju programa se ispisuje da li su sve zagrade uparene.

        Scanner s = new Scanner(System.in);

        int openCounter = 0;
        int closedCounter = 0;
        boolean isRunning = true;

        while (isRunning)
        {
            System.out.print("Unos: ");
            String unos = s.next();

            if(unos.equals("("))
            {
                openCounter++;
            }
            else if(unos.equals(")"))
            {
                closedCounter++;
            }

            if(unos.equals("="))
            {
                isRunning = false;
            }

        }
        if(closedCounter == openCounter)
        {
            System.out.println("Zagrade su uparene");
        }
        else
        {
            System.out.println("Zagrade nisu uparene");
        }
    }
}
