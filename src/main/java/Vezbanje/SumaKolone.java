package Vezbanje;

import com.sun.deploy.panel.AbstractRadioPropertyGroup;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SumaKolone {
    public static void main(String[] args) {

//        Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli.
//        Program ima niz brojeva duzine 25, koji izgleda kao tabela 5x5,
//        niz je sa fiksnim vrednostima tj. ne unosi ih korisnik.
//        Program stampa tabelu na ekranu a zatim od korisnika trazi da
//        unese kolonu po kojoj bi zeleo da sumira vrednosti
//        i na kraju programa ispisuje sumu za trazenu kolonu.

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> tabela = new ArrayList<>();

        tabela.add(1);
        tabela.add(8);
        tabela.add(2);
        tabela.add(6);
        tabela.add(9);
        tabela.add(4);
        tabela.add(5);
        tabela.add(3);
        tabela.add(1);
        tabela.add(0);
        tabela.add(1);
        tabela.add(6);
        tabela.add(7);
        tabela.add(7);
        tabela.add(8);
        tabela.add(2);
        tabela.add(3);
        tabela.add(4);
        tabela.add(9);
        tabela.add(1);
        tabela.add(5);
        tabela.add(8);
        tabela.add(7);
        tabela.add(3);
        tabela.add(7);

        for (int i = 0; i < tabela.size(); i++) {

            if(i % 5 == 0 || i == 0){
                System.out.println(" ");
            }
            System.out.print(tabela.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("----------------------------");
        System.out.print("Unesite kolonu za sumiranje: ");
        int x = s.nextInt();

        int kolona = tabela.size() / 5;
        int suma = tabela.get(x-1);

        for (int i = x - 1; i < tabela.size(); i = i + kolona) {
            if(x == 1 && i < tabela.size() - kolona){
                suma = suma + tabela.get(i + kolona);

            } else if (x == 2 && i < tabela.size() - kolona) {
                suma = suma + tabela.get(i + kolona);

            }
            else if (x == 3 && i < tabela.size() - kolona) {
                suma = suma + tabela.get(i + kolona);
            }
            else if (x == 4 && i < tabela.size() - kolona) {
                suma = suma + tabela.get(i + kolona);
            }
            else if (x == 5 && i < tabela.size() - kolona) {
                suma = suma + tabela.get(i + kolona);
            }
        }
        System.out.println("Suma je " + suma);

    }
}
