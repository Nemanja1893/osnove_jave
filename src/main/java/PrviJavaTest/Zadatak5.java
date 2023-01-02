package PrviJavaTest;

public class Zadatak5 {
    public static void main(String[] args) {

//        Napisati metodu koja radi pakovanje nekog teksta u HTML elemente.
//        Metoda kao parametar prima tekst i tip, a vraca HTML element (String) sa proslednjenim tekstom.
//        Metoda podrzava sledece tipove:
//
//        bold, metoda pakuje tekst u <b>prosledjen tekst</b>
//        italic, metoda pakuje tekst u <em>proslednjen tekst</em>
//        paragraph, metoda pakuje tekst u <p>prosledjen tekst</p>
//
//        Ukoliko se prosledi tip koji nije podrzan, vraca se neupakovan tekst tj.
//        vraca se nakav kakav je dosao umetodu

        System.out.print(pakovanje("Ovaj deo je bold", "bold"));
        System.out.print(", a ");
        System.out.println(pakovanje("ovo je italic", "italic"));
        System.out.println(pakovanje("Naravno samo je falio paragraf", "paragraph"));



    }
    public static String pakovanje(String tekst, String tip){

        String bold = "<b>" + tekst + "</b>";
        String italic = "<em>" + tekst + "</em>";
        String paragraph = "<p>" + tekst + "</p>";

        if(tip.equals("bold")){
            return bold;
        } else if (tip.equals("italic")) {
            return  italic;
        } else if (tip.equals("paragraph")) {
            return paragraph;
        } else {
            return tekst;
        }

    }
}
