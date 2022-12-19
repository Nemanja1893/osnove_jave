package p19_12_2022;

public class Zadatak1
{
    public static void main(String[] args)
    {
        int suma = 0;

        for (int i = 1; i <= 50; i++)
        {
            if(i % 2 == 0)
            {
                suma = suma + i;
            }
        }
        System.out.println("Suma parnih brojeva od 1 do 50 je " + suma);
    }
}
