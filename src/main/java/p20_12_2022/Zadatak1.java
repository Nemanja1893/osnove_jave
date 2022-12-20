package p20_12_2022;

import java.util.Scanner;

public class Zadatak1
{
    public static void main(String[] args)
    {
//        Napisati program koji validira unos input polja za broj.
//        Polje za unos prima samo brojeve u opsegu od 10 do 50.
//        Korisnik unosi vrednosti dok ne unese validan  broj.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int unos = s.nextInt();

        while (!(unos > 10 && unos < 50))
        {
            System.out.println("Greska broj nije u opsegu 10 do 50");
            System.out.println("Unesite broj: ");
            unos = s.nextInt();

        }

        System.out.println("Broj je validan, kraj programa");
    }
}
