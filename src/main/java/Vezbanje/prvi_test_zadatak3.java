package Vezbanje;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class prvi_test_zadatak3 {

    public static void main(String[] args) {

//        Za potrebe loto igre na srecu, potrebno je napisati program koja ispisuje informaciju da li
//        je odigrana loto kombinacija upravo dobitna kombinacija. Korisnik unosi dva niza oba duzine
//        7, prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu kombinaciju.
//        Program na kraju ispisuje da li je dobitna kombinacija.


        Scanner s = new Scanner(System.in);

        ArrayList<Integer> odigrana = new ArrayList<>();
        ArrayList<Integer> izvucena = new ArrayList<>();

        int counter = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Odigrajte broj: ");
            int x = s.nextInt();

            odigrana.add(x);
        }
        for (int i = 0; i < 7; i++) {
            System.out.print("Izvucen broj je: ");
            int x = s.nextInt();

            izvucena.add(x);

        }
        for (int i = 0; i < odigrana.size(); i++) {

            if(odigrana.get(i) == izvucena.get(i)){
                counter++;
            }
        }
        if(counter == 7){
            System.out.println("Jeste dobitna kombinacija");
        }else {
            System.out.println("Nije dobitna kombinacija");
        }


    }
}
