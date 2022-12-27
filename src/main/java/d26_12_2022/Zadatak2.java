package d26_12_2022;

public class Zadatak2
{
    public static void main(String[] args)
    {
//        Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
//        Metoda od parametara prima ime i prezime (2 parametra) i vraca jedan
//        string tako sto spoji ime i prezime.

        String punoIme = combineName("Nemanja", "Nikolic");
        System.out.println("Puno ime i prezime: " + punoIme);

    }
    public static String combineName(String ime, String prezime)
    {
//        String imeIPrezime = ime + " " + prezime;
        return ime + " " + prezime;
    }
}
