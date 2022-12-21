package p21_12_2022;

import java.util.ArrayList;

public class Zadatak3
{
    public static void main(String[] args)
    {

//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i
//        koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(5);
        brojevi.add(8);

       int lastIndex = brojevi.size() - 1;
       int lastIndexValue = brojevi.get(lastIndex);
       int firstIndexValue = brojevi.get(0);

        brojevi.set(0, lastIndexValue);
        brojevi.set(lastIndex, firstIndexValue);

        System.out.println(brojevi.get(0) + "  " + brojevi.get(lastIndex));


    }
}
