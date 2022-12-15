package d14_12_2022;

import java.util.Scanner;

public class Zadatak6
{
    public static void main(String[] args)
    {
//        (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d)
//        i formira string p (p ima startni deo #) tako sto negativne brojeve lepi sa leve strane
//        a pozitivne i nulu sa desne.

        Scanner s = new Scanner(System.in);

        String p;
        String space = " ";

        System.out.print("Unesite a: ");
        int a = s.nextInt();
        if (a < 0)
        {
            p = a + " # ";
            System.out.println(" -> " + p + space);
        }
        else
        {
            p = " # " + a + space;
            System.out.println(" -> " + p + space);
        }


        System.out.print("Unesite b: ");
        int b = s.nextInt();

        if (b < 0)
        {
            p = b + space + p;
            System.out.println(" -> " + p);
        }
        else
        {
            p = p + b + space;
            System.out.println(" -> " + p + space);
        }

        System.out.print("Unesite c: ");
        int c = s.nextInt();

        if (c < 0)
        {
            p = c + space + p;
            System.out.println(" -> " + p);
        }
        else
        {
            p = p + c + space;
            System.out.println(" -> " + p + space);
        }

        System.out.print("Unesite d: ");
        int d = s.nextInt();

        if (d < 0)
        {
            p = d + space + p;
            System.out.println(" -> " + p);
        }
        else
        {
            p = p + d + space;
            System.out.println(" -> " + p + space);
        }

        System.out.println("String p ima vrednost =" + p);

        


    }
}
