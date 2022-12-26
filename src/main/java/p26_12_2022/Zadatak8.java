package p26_12_2022;

public class Zadatak8
{
    public static void main(String[] args)
    {
//        Napisati metodu koja proverava da li je trougao pravougli.
//        Metoda prima stranice trougla i hipotenuzu trougla.
//        Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
         int a = 4;
         int b = 4;
         int c = 4;

         boolean pravougli = daLiJePravougli(a, b, c);
        System.out.println("Trougao je pravougli " + pravougli);


    }
    public static boolean daLiJePravougli(int a, int b, int c)
    {
        if((a * a) + (b * b) == c*c)
        {
            return true;
        }
        return  false;

    }
}
