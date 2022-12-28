package d27_12_2022;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Zadatak1
{
    public static void main(String[] args) {

//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        konvertuj - metoda konvertuje tezinu u kilograme i tone.
//        Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost.
//        Jedinica moze biti “kg” ili “t”

        Scanner s = new Scanner(System.in);


        Proizvod firstProduct  = new Proizvod();
        firstProduct.name = "TV";
        firstProduct.price = 536;
        firstProduct.weightInG = 5000;

        firstProduct.print();

        System.out.print("Unesite tip za konverziju ");
        String weightType = s.next();
        System.out.println("Proizvod je tezak " + firstProduct.convertWeight(weightType) + " u " + weightType);

        Proizvod secondProduct = new Proizvod();
        secondProduct.name = "Bed";
        secondProduct.price = 856;
        secondProduct.weightInG = 50000;

        secondProduct.print();

        System.out.print("Unesite tip za konverziju ");
        weightType = s.next();
        System.out.println("Proizvod je tezak " + secondProduct.convertWeight(weightType) + " u " + weightType);


    }
}
