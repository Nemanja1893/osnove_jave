package PrviJavaTest;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji za dve unete osobe ispisuje koja je starija.
//        Za svaku osobu se od  podataka unosi ime, godina, mesec i dan rodjenja.
//        Na kraju programa ispisati koja je osoba starija.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime prve osobe: ");
        String imePrve = s.next();
        System.out.print("Unesite godinu rodjenja prve osobe: ");
        int godinaPrve = s.nextInt();
        System.out.print("Unesite mesec rodjenja prve osobe: ");
        int mesecPrve = s.nextInt();
        System.out.print("Unesite dan rodenja prve osobe: ");
        int danPrve = s.nextInt();

        System.out.print("Unesite ime druge osobe: ");
        String imeDruge = s.next();
        System.out.print("Unesite godinu rodjenja druge osobe: ");
        int godinaDruge = s.nextInt();
        System.out.print("Unesite mesec rodjenja druge osobe: ");
        int mesecDruge = s.nextInt();
        System.out.print("Unesite dan rodenja druge osobe: ");
        int danDruge = s.nextInt();


        if(godinaPrve < godinaDruge)
        {
            System.out.println(imePrve + " je stariji od " + imeDruge);
        } else if (godinaPrve == godinaDruge && mesecPrve < mesecDruge) {

            System.out.println(imePrve + " je stariji od " + imeDruge);
        }
        else if (godinaPrve == godinaDruge && mesecPrve == mesecDruge && danPrve < danDruge){
            System.out.println(imePrve + " je stariji od " + imeDruge);
        }
        else if(godinaPrve == godinaDruge && mesecPrve == mesecDruge && danPrve == danDruge ){
            System.out.println(imePrve + " je iste starosti kao " + imeDruge);
        }
        else
        {
            System.out.println(imeDruge + " je stariji od " + imePrve);
        }


    }
}
