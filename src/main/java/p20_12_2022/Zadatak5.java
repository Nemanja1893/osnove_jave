package p20_12_2022;

import java.util.Scanner;

public class Zadatak5
{
    public static void main(String[] args)
    {
//        Napisati pogram koji vrsi korkeciju zvuka. Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”.
//        Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75.
//        Pojacaj - akcije koja povecava jacinu zvuka za 10
//        smanji - akcija koja smajnjuje jacinu zvuka za 10.
//        Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
//        Na kraju programa odstampati jacinu zvuka.

        Scanner s = new Scanner(System.in);

        String action = " ";
        int volume = 75;


        while (!action.equals("play"))
        {

            System.out.print("Unesite akciju: ");
            action = s.next();

            if(action.equals("pojacaj"))
            {
                volume = volume + 10;
            }
            else if (action.equals("smanji"))
            {
                volume = volume - 10;
            }

            if(volume >= 100)
            {
                volume = 100;
            }
            else if(volume <= 0)
            {
                volume = 0;
            }
        }
        System.out.println("Jacina zvuka je " + volume);

    }
}
