package p14_12_2022;

import java.util.Scanner;

public class Zadatak2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dan: ");
        String dan = s.next();

        System.out.println("Unesite mesec: ");
        String mesec = s.next();

        System.out.println("Unesite godinu: ");
        String godina = s.next();

        System.out.println(dan + "-" + mesec + "-" + godina);

    }
}
