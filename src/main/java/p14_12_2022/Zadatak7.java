package p14_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak7
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Znak karte na stolu: ");
        String znakKarteNaStolu = s.next();

        System.out.print("Broj karte na stolu: ");
        String brojKarteNaStolu = s.next();

        System.out.print("Znak karte koju zelis da odigras: ");
        String znakKarteIgraca = s.next();

        System.out.print("Broj karte koju zelis da odigras: ");
        String brojKarteIgraca = s.next();

        if(znakKarteNaStolu.equals(znakKarteIgraca) || brojKarteNaStolu.equals(brojKarteIgraca))
        {


            System.out.println("Potez je validan");
        }
        else
        {


            System.out.println("Potez nije validan");
        }


    }
}
