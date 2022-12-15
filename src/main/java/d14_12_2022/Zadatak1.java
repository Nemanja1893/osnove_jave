package d14_12_2022;

import java.util.Scanner;

public class Zadatak1
{
    public static void main(String[] args)
    {
//        Napisati program koji ima informacije koje ucitava informacije sa tastature:
//        Ime
//        Prezime
//        godinu rodjenja

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = s.next();

        System.out.print("Unesite prezime: ");
        String prezime = s.next();

        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();


        if(ime.equals("Milan") && prezime.equals("Jovanovic") && godinaRodjenja == 1995)
        {
            System.out.println(ime + " " + prezime + " - 26 god");

        }


    }
}
