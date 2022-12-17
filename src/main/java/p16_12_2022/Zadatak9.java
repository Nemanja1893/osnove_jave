package p16_12_2022;

import java.util.Scanner;

public class Zadatak9
{
    public static void main(String[] args)
    {
//          Napisati program koji iscrtava timeline na youtube videu.
//          Korisnik unosi duzinu videa u sekundama i trenutno vreme u videu,
//          a program iscrtava timeline tako sto deo koji je pogledan iscrtava zvezdicama
//          a ostatak crticama. Timeline je kontrola koja ima tacno 100 karaktera.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu videa: ");
        int duzinaVidea = s.nextInt();

        System.out.println("Unesite trenutno vreme videa: ");
        int trenutnoVreme = s.nextInt();

        int progres = 100 / (duzinaVidea / trenutnoVreme);

        int minFull  = duzinaVidea / 60;
        int secFull = duzinaVidea - (minFull * 60);

        int minProgress = trenutnoVreme / 60;
        int secProgress = trenutnoVreme - (minProgress * 60);

        for (int i = 1; i <= 100; i++)
        {
            if(i < progres)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print("_");
            }

        }
        System.out.println(" ");
        System.out.println(minProgress + ":" + secProgress + " / " + minFull + ":" + secFull);




    }
}
