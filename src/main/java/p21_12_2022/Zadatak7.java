package p21_12_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak7
{
    public static void main(String[] args)
    {
//        Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva.
//            Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(8);
        brojevi.add(60);
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);

        Random random = new Random();

        for (int i = 0; i < 8; i++)
        {
            int firstIndex = random.nextInt(brojevi.size());
            int secondIndex = random.nextInt(brojevi.size());

            int firstValue = brojevi.get(firstIndex);
            int secondValue = brojevi.get(secondIndex);

            brojevi.set(firstIndex, secondValue);
            brojevi.set(secondIndex, firstValue);

            System.out.println(firstIndex + "  " + secondIndex);
            System.out.println(brojevi.get(firstIndex) + "  " + brojevi.get(secondIndex)  );
        }


    }
}
