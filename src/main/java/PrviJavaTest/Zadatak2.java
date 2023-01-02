package PrviJavaTest;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati program koji petljom iscrtava toplomer.
//        Korisnik sa tastature unosi granice toplomera i iscrtava se slika kao u primeru

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite donju granicu: ");
        int donja = s.nextInt();
        System.out.print("Unesite gornju granicu: ");
        int gornja = s.nextInt();

        int razlika = gornja - donja;

        for (int i = 0; i <= razlika; i++) {
            System.out.println("|-" + gornja + " |");
            gornja--;
        }
        System.out.println("\\   /");
        System.out.println("|    |");

    }
}
