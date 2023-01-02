package PrviJavaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji cuva dva niza celih brojeva,
//        jedan za parne brojeve a drugi za neparne brojeve.
//        Program sa tastature ucitava N brojeva koje unosi korisnik i parne brojeve
//        dodaje u niz parnih brojeva a neparne brojeve u niz neparnih.
//        Na kraju programa odstampati brojeve oba niza kao i sumu svakog niza.
//        Napomena: Nizovi se stampaju koristeci petlje.

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> parni = new ArrayList<>();
        ArrayList<Integer> neparni = new ArrayList<>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            if(broj % 2 == 0)
            {
                parni.add(broj);
            }
            else{
                neparni.add(broj);
            }
        }
        int sumaParnih = 0;
        System.out.print("Niz parnih: ");

        for (int i = 0; i < parni.size(); i++) {
            System.out.print(parni.get(i) + ", ");
            sumaParnih = sumaParnih + parni.get(i);
        }

        System.out.println(" ");
        System.out.print("Suma parhih je: " + sumaParnih);
        System.out.println(" ");

        int sumaNeparnih = 0;
        System.out.print("Niz neparnih: ");

        for (int i = 0; i < neparni.size(); i++) {
            System.out.print(neparni.get(i) + ", ");
            sumaNeparnih = sumaNeparnih + neparni.get(i);
        }

        System.out.println(" ");
        System.out.print("Suma neparnih je: " + sumaNeparnih);
    }
}
