package d12_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Kreirati klasu ZeleniKarton koja ima:
//        ime i prezime studenta
//        broj indeksa
//        naziv predmeta
//        ime i prezime profesora
//        ocenu - od 5 do 10
//        gettere i settere
//                konstruktore
//        metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//        metodu stampaj koja stampa podatke u formatu:
//        (naziv predmeta) - (ocena)
//                Student: ime i prezime, broj indeksa
//        Profesor: ime i prezime
//
//        U glavnoj klasi:
//        kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//                 (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//                 (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

        Scanner s = new Scanner(System.in);
        ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<ZeleniKarton>();

        System.out.print("Unesite broj studenata: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite ime studenta: ");
            String imeS = s.next();
            System.out.print("Unesite broj idenksa: ");
            int index = s.nextInt();
            System.out.print("Unesite zaviv predmeta: ");
            String predmet = s.next();
            System.out.print("Unesite ime profesora: ");
            String imeP = s.next();
            System.out.print("Unesite ocenu: ");
            int ocena = s.nextInt();

            ZeleniKarton zeleniKarton = new ZeleniKarton(imeS, index, predmet, imeP, ocena);
            zeleniKartoni.add(zeleniKarton);
        }
        double suma = 0;
        double prosecnaOcena = 0;
        for (int i = 0; i < zeleniKartoni.size(); i++) {

            ZeleniKarton z = zeleniKartoni.get(i);

            if(z.polozenIspit()){
                int ocena = z.getOcena();
                suma = suma + ocena;
            }

            zeleniKartoni.get(i).stampaj();
        }
        prosecnaOcena = suma / zeleniKartoni.size();
        System.out.println("Prosecna ocena je: " + prosecnaOcena);

    }
}
