package p14_12_2022;

import java.util.Scanner;

public class Zadatak1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = scanner.next();

        System.out.println("Unesite prezime: ");
        String prezime = scanner.next();

        System.out.println("Unesite JMBG: ");
        String jmbg = scanner.next();

        System.out.println("Unesite broj: ");
        String broj = scanner.next();

        System.out.println("Unesite eMail: ");
        String email = scanner.next();

        System.out.println(ime + " " + prezime + " - " + jmbg);
        System.out.println("Broj tel: +" + broj);
        System.out.println("Email: " + email);
    }
}
