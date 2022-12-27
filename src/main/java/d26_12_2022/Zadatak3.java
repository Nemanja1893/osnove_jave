package d26_12_2022;

public class Zadatak3
{
    public static void main(String[] args)
    {
//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri
//        funkcije vraca novu vrednost koja se formira kao na primeru.

        int result = combineNumber(9,5);
        System.out.println("Broj je: " + result);
    }
    public static int combineNumber(int a, int b)
    {
        return a * 10 + b;
    }
}

