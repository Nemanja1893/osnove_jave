package d14_12_2022;

import java.util.Scanner;

public class Zadatak2
{
    public static void main(String[] args)
    {
//        Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2)
//        Ukoliko se za b unese:
//        b=1, vrednost promenljive a se uvecava za 10
//        b=2, vrednost promenljive a se smanjuje za 20
//        Na kraju zadatka odstampati novu vrednost promenljive a.


        Scanner s = new Scanner(System.in);

        boolean isValid = true;

        System.out.print("Unesite a: ");
        int a = s.nextInt();

        System.out.print("Unesite b: ");
        int b = s.nextInt();

        if(b == 1)
        {
            a = a + 10;
        }
        else if (b == 2)
        {
            a = a - 20;
        }
        else
        {
            System.out.println("Pogresan unos");
            System.out.println("Vrednost a ostaje: " + a);
            isValid = false;
        }

        if(isValid)
        {
            System.out.println("Nova vrednost za a je: " + a);

        }

    }
}
