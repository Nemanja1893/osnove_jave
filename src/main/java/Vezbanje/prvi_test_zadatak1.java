package Vezbanje;

import java.util.Scanner;

public class prvi_test_zadatak1 {

    public static void main(String[] args) {

//        Napisati program koji za unetu visinu i težinu osobe računa indeks telesne
//        mase (BMI) i na osnovu tog rezultata osobu raspoređuje u jednu od četiri kategorije.
//        BMI se računa po formuli
//
//        𝐵𝑀𝐼 = 𝑡𝑒𝑧𝑖𝑛𝑎 𝑢 𝑘𝑔 / (𝑣𝑖𝑠𝑖𝑛𝑎 𝑢 𝑚)kvandratnom


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite tezinu osobe (kg): ");
        double weight = s.nextDouble();

        System.out.print("Unesite visinu osobe (m): ");
        double height = s.nextDouble();

        double bmi = weight / (height * height);

        if(bmi < 18.5){
            System.out.println("Kategorija je: Neuhranjenost");
        } else if (bmi > 18.5 && bmi < 24.99) {
            System.out.println("Kategorija je: Normalna tezina");
        }else if (bmi > 25 && bmi < 29.99) {
            System.out.println("Kategorija je: Prekomerna tezina");
        }else if (bmi >= 30) {
            System.out.println("Kategorija je: Gojaznost");
        }


    }
}
