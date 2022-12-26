package p26_12_2022;

public class Zadatak3
{
    public static void main(String[] args)
    {
//        Napisati metodu koja stampa zvezdicu sa razmakom.
//        U glavnom programu je potrebno odstampati sledecu
//        sliku koristeci metode koje smo definisali.

        for (int i = 0; i < 3; i++)
        {
            stampajZvezdicu();
        }
        System.out.println(" ");
        stampajZvezdicu();
        stampajZvezdicu();
        System.out.println(" ");
        stampajZvezdicu();

    }
    public static void stampajZvezdicu()
    {
        System.out.print("* ");
    }
}
