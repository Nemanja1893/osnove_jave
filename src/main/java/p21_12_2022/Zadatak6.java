package p21_12_2022;

import java.util.ArrayList;

public class Zadatak6
{
    public static void main(String[] args)
    {
//        Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(8);
        brojevi.add(10);

        for (int i = brojevi.size() -1; i >= 0; i--)
        {
            System.out.println(brojevi.get(i));
        }

    }
}
