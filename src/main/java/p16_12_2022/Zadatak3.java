package p16_12_2022;

import java.util.Scanner;

public class Zadatak3
{
    public static void main(String[] args)
    {
//        Napisati porogram koji od korisnika ucitava dva broja M i N i
//        stampa sve brojeve izmedju M i N. Smatrajte da je M manje od N.
//        Primer izvrsenja:
//        Unesite M: 10
//        Unesite N: 15
//        10, 11, 12, 13, 14, 15,

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite M: ");
        int M = s.nextInt();

        System.out.println("Unesite N: ");
        int N = s.nextInt();

        for (int i = M; i < N + 1; i++)
        {
            System.out.print(i);
        }

    }
}
