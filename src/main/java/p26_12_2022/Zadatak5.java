package p26_12_2022;

public class Zadatak5
{
    public static void main(String[] args)
    {
        absPrint(-2);
        absPrint(5);
        absPrint(-10);
    }
    public static void absPrint(int broj)
    {
        if(broj < 0)
        {
            System.out.print("Apsolutna vrednost je: " + -broj);
            System.out.println("  ");
        }
        else
        {
            System.out.print("Apsolutna vrednost je: " + broj);
            System.out.println("  ");
        }
    }
}
