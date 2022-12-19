package p19_12_2022;

import java.util.Scanner;

public class Zadatak12
{
    public static void main(String[] args)
    {
//        Napisati program prikazuje koliko je svaki od unetih passworda jak.
//        Korisnik unosi N passworda i za svaki se ispisuje jacina.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();


        for (int i = 0; i < n; i++)
        {
            System.out.println("Unesite password: ");
            String pass = s.next();
            int poen = 0;

            if(pass.length() > 8)
            {
                poen++;
            }
            if (pass.contains("@"))
            {
                poen++;
            }

            System.out.println("Password ima " + poen + " poena");

        }

    }
}
