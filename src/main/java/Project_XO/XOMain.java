package Project_XO;

import java.util.ArrayList;
import java.util.Scanner;

public class XOMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        XOTabla tabla = new XOTabla();
        boolean isRunning = true;

        System.out.print("Unesite ime igraca X: ");
        tabla.setImeX(s.next());
        System.out.print("Unesite ime igraca O: ");
        tabla.setImeO(s.next());

        tabla.pokreniIgru();

        while (isRunning){
            tabla.stampaj();

            int potez = s.nextInt();
            if(!tabla.poljePrazno(potez)) {
                System.out.println("Potez nije validan");
            }
            else{
                tabla.odigrajPotez(potez);
                tabla.zameniIgraca();
            }

            if(tabla.pobednikX()){
                System.out.println("Cestitamo! Pobednik je igrac X");
                System.out.println("Bravo " + tabla.getImeX());
                isRunning = false;
            } else if (tabla.pobednikO()) {
                System.out.println("Cestitamo! Pobednik je igrac O");
                System.out.println("Bravo " + tabla.getImeO());
                isRunning = false;
            } else if (tabla.popunjenaTabla()) {
                System.out.println("Igra je neresena.");
                isRunning = false;
            }

        }

    }

}
