package p26_12_2022;

public class Zadatak9
{
    public static void main(String[] args)
    {
//        Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).

        String rimski = "II";

        int arab = numConverter(rimski);
        System.out.println("Arapski je: " + arab);

    }
    public static int numConverter(String rimski)
    {
        if(rimski.equals("I"))
        {
            return 1;
        }
        else if (rimski.equals("II"))
        {
            return 2;
        }
        else if(rimski.equals("III"))
        {
            return 3;
        }
        else if(rimski.equals("IV"))
        {
            return 4;
        }
        else if(rimski.equals("V"))
        {
            return 5;
        }
        else
        {
            return 0;
        }
    }
}
