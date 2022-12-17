package d16_12_2022;

import java.util.Scanner;

public class Zadatak1
{
    public static void main(String[] args)
    {
//        Napisati program koji za uneti broj x (smatrajte da korisnik unosi jednocifreni broj)
//        ispisuje tablicu mnozenja za taj broj.

        Scanner s = new Scanner(System.in);

        System.out.println("X mora da bude jednocifren broj");
        
        System.out.print("Unesite x: ");
        int x = s.nextInt();

        for (int i = 1; i < 10; i++)
        {
            int rezultat = x * i;
            System.out.println(x + " x " + i + " = " + rezultat);
        }
        

    }
}
