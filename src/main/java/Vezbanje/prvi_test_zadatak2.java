package Vezbanje;

import java.util.Scanner;

public class prvi_test_zadatak2 {

    public static void main(String[] args) {

//        Napisati program koji učitava brojeve od korisnika dok ne unese dve nule
//        zaredom.Na kraju programa ispisati sumu unetih brojeva.

        Scanner s = new Scanner(System.in);

        boolean isRunning = true;
        int zeroCounter = 0;
        int suma = 0;
        while (isRunning)
        {
            System.out.print("Unesite broj: ");
            int x = s.nextInt();

            if(x == 0){
                zeroCounter++;
            }else {
                zeroCounter = 0;
                suma = suma + x;
            }
            if(zeroCounter == 2){
                isRunning = false;
            }
        }
        System.out.println("Suma je " + suma);


    }
}
