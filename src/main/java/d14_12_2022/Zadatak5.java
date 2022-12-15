package d14_12_2022;

import java.util.Scanner;

public class Zadatak5
{
    public static void main(String[] args)
    {
//        Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
//        (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu
//        odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.

        Scanner s = new Scanner(System.in);

        int c = 0;
        boolean isValid = true;

        System.out.print("Unesite a: ");
        int a = s.nextInt();

        System.out.print("Unesite b: ");
        int b = s.nextInt();

        System.out.println("Unesite operator: ");
        String operator = s.next();

        if(operator.equals("+"))
        {
            c = a + b;
        }
        else if (operator.equals("-"))
        {
            c = a - b;
        }
        else if (operator.equals("*"))
        {
            c = a * b;
        }
        else if (operator.equals("/"))
        {
            c = a / b;
        }
        else
        {
            System.out.println("Pogresan unos operatora");
            isValid = false;
        }

        if (isValid)
        {
            System.out.println("Rezultat: " + c);
        }


    }
}
