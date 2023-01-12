package p12_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Kreirati klasu Sastojak koja ima:
//        naziv sastojka
//        cenu
//        gettere i settere
//                konstuktore
//
//
//        U glavnom programu kreirati 3 sastojka.
//        U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

        
//        Sastojak s1 = new Sastojak("so", 23);
//        Sastojak s2 = new Sastojak("biber", 24);
//        Sastojak s3 = new Sastojak("secer", 43);
        
        Scanner s = new Scanner(System.in);
        
        ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();

        System.out.println("Unesite broj sastojaka " );
        int x = s.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Unesite sastojak i cenu");
            sastojci.add(new Sastojak(s.next(), s.nextInt()));
        }
        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println(sastojci.get(i).getIme() + " cena: " + sastojci.get(i).getCena());
        }

       
        


    }
}
