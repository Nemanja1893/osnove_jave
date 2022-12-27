package d26_12_2022;

public class Zadatak4
{
    public static void main(String[] args)
    {
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
//        Metoda nista ne vraca.

        stampajPodatke("1234-4124-1412-4123", "Nemanja", "Nikolic",
                        1993, true);

        stampajPodatke("1894-4174-1522-4129", "Pera", "Peric",
                1985, false);



    }
    public static void stampajPodatke(String jmbg, String ime, String prezime, int godRodj, boolean active)
    {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + godRodj);
        System.out.println("Aktivan: " + active);
        System.out.println("----------------------");
        System.out.println(" ");


    }
}
