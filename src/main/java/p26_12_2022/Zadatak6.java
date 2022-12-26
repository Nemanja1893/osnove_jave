package p26_12_2022;

public class Zadatak6
{
    public static void main(String[] args)
    {
//        Napisati metodu koja stampa N zvezdica u istom redu,
//        na kraju reda stampa novi red.. Broj zvezdica je odredjen parametrom N.

        int n = 5;
        int m = 20;
//        starPrint(n);
//        starPrint(10);
//        starPrint(15);

        for (int i = 1; i <= m; i++)
        {
            starPrint(i);
        }
    }
    public static void starPrint(int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print("* " );
        }
        System.out.println(" ");
    }

}
