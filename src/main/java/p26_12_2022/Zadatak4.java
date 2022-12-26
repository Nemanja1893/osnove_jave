package p26_12_2022;

public class Zadatak4
{
    public static void main(String[] args)
    {
//        Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//        Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju
//        sa razlicitim prosledjenim vrednostima.

        int a = 10;
        int b = 2;

        racunanje(a, b);
        racunanje(20, 10);
        racunanje(100, 50);
        racunanje(200, 2);
    }
    public static void racunanje(int a, int b)
    {
        System.out.print("Zbir je: " + (a + b));
        System.out.println(" ");
        System.out.print("Razlika je: " + (a - b));
        System.out.println(" ");
        System.out.print("Prozvod je: " + a * b);
        System.out.println(" ");
        System.out.print("Kolicnik je: " + a / b);
        System.out.println("  ");
        System.out.println("---------------");
        System.out.println("  ");
    }

}
