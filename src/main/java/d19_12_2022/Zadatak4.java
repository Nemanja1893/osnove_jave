package d19_12_2022;

import java.util.Scanner;

public class Zadatak4
{
    public static void main(String[] args)
    {
//       Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
//       Korisnik unosi N rekacija zatim se prikazuje evidencija:
//       Program podrzava sledece reakcije:
//           like
//           smile
//           heart

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        int smileCounter = 0;
        int likeCounter = 0;
        int hearhCounter = 0;

        for (int i = 0; i < n; i++)
        {
            System.out.print("Reaguj: ");
            String tekst = s.next();

            if(tekst.equals("smile"))
            {
                smileCounter++;
            }
            else if(tekst.equals("heart"))
            {
                hearhCounter++;
            }
            else if(tekst.equals("like"))
            {
                likeCounter++;
            }

        }

        System.out.println("Summary: " + "like " + likeCounter
                                        + " | smile " + smileCounter
                                        + " | heart " + hearhCounter);


    }
}
