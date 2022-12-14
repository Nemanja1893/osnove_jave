package p14_12_2022;

import java.util.Scanner;

public class Zadatak9
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int jacinaZvuka = 75;

        System.out.println("Jacina zvuka je: " + jacinaZvuka);

        System.out.println("Unesite akciju");
        String unos = s.next();


        if(unos.equals("pojacaj"))
        {
            System.out.println("Nova jacuna zvuka je: " + jacinaZvuka + 10);
        }
        else if (unos.equals("smanji"))
        {
            System.out.println("Nova jacuna zvuka je: " + (jacinaZvuka - 10));
        }
        else if (unos.equals("mute"))
        {
            System.out.println("Nova jacuna zvuka je: " + 0);
        }

    }
}
