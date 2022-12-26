package p26_12_2022;

public class Zadatak7
{
    public static void main(String[] args)
    {
//        Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
//        Metoda prima broj N i vraca ga sa negativnom vrednoscu.

        int x = reverseNumber(5);
        System.out.println(x);

    }
    public static int reverseNumber(int n)
    {
        return -n;
    }

}
