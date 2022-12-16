package p16_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak5
{
    public static void main(String[] args)
    {
//        Napisati program koji simulira stampanje ocitane licne karte u vise primeraka.
//        Korisnik unosi podatke :
//        ime
//        prezime
//        jmbg
//        broj primeraka za stampu

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = s.next();

        System.out.print("Unesite prezime: ");
        String prezime = s.next();

        System.out.print("Unesite JMBG: ");
        String jmbg = s.next();

        System.out.print("Unesite broj primerka za stampu: ");
        int brojPrimerka = s.nextInt();

        for (int i = 1; i <= brojPrimerka; i++)
        {
            System.out.println("Primerak " + i);
            System.out.println("********************");
            System.out.println("Ime i prezime: " + ime + " " + prezime);
            System.out.println("JMBG: " + jmbg);
            System.out.println("********************");
        }

    }
}
