package p14_12_2022;

import java.util.Scanner;

public class Zadatak10
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesi a: ");
        int a = s.nextInt();

        if(a % 2 == 0)
        {
            System.out.println("Broj je deljiv sa 2");

        } else if (a % 3 == 0)
        {
            System.out.println("Broj je deljiv sa 3");
        }
        else
        {
            System.out.println("Broj nije deljiv ni sa 2 ni sa 3s");
        }

    }
}
