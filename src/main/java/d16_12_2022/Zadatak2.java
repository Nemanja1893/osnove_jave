package d16_12_2022;

public class Zadatak2
{
    public static void main(String[] args)
    {
//        Napisati program koji stampa 25 _ (donjih crta),
//        pritom na svaku 5. iteraciju odstampa i novi red.
//        Zadatak resiti pomocu FOR petlje.

        for (int i = 1; i <= 25; i++)
        {
            if(i % 5 == 0)
            {
                System.out.print("_ ");
                System.out.println(" ");

            }
            else
            {
                System.out.print("_ ");

            }

        }
    }
}
