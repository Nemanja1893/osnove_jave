package d26_12_2022;

import java.util.Scanner;

public class Zadatak6
{
    public static void main(String[] args)
    {
//        Napisati funkciju koja vrsi konverziju eura u dinare,
//        rublje ili dolare prema dole navedenoj konverziji.
//        Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je
//        potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost u eurima ");
        int eu = s.nextInt();

        System.out.print("Unesite valutu za konverziju ");
        String valuta = s.next();

        double converted = convertValue(eu, valuta);
        System.out.println(eu + " EUR je " + converted + " " + valuta);

    }
    public static double convertValue(int eu, String valuta)
    {
        if(valuta.equals("RSD"))
        {
            return eu * 117.5;
        }
        else if (valuta.equals("USD"))
        {
            return  eu * 1.1;
        }
        else if (valuta.equals("RUB"))
        {
            return eu * 62.98;
        }
        else
        {
            return 0;
        }
    }
}
