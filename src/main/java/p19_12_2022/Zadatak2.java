package p19_12_2022;

public class Zadatak2
{
    public static void main(String[] args)
    {
//        Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju

        int broj = 1;


        for (int i = 0; i < 7; i++)
        {
            broj = broj * 2;
        }
        System.out.println("Stepen je " + broj);
    }
}
