package d13_12_2022;

public class Zadatak2 {
    public static void main(String[] args)
    {
//        Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici.
//        Od informacija se pamti broj kartice (16 cifara sa razmacima),
//        mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice.
//        Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne
//        i nije u liniji to ce zavisiti od duzine imena.
//        Napomena: svaka informacija mora da bude u okviru posebne promenljive.

        String vrstaKartice = "Credit Card";
        String brojKartice = "4123 1234 3546 6534";
        String imeIPrezime = "Nemanja Nikolic";
        String datumaIsteka = "17/25";

        String bigLine = "*********************************";
        String smallLine = "****";

        System.out.println(bigLine);
        System.out.println("*  " + vrstaKartice + "                  *");
        System.out.println("*    " + smallLine + "                       *");
        System.out.println("*    " + smallLine + "                       *");
        System.out.println("*       " + brojKartice + "     *");
        System.out.println("*               " + "valid > " + datumaIsteka + "   *");
        System.out.println("*                               *");
        System.out.println("*    " + imeIPrezime + "            *");
        System.out.println(bigLine);


    }
}
