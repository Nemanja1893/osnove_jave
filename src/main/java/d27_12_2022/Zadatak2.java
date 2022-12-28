package d27_12_2022;

public class Zadatak2
{
    public static void main(String[] args) {

//        Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu
//        atribut za mod (hladi/greje) - string
//        metodu za stampu (proizvoljno)
//        metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//        Metoda kao parametar prima temperaturu koja je napolju.

        SmartAirConditioning samsung = new SmartAirConditioning();
        samsung.brand = "Samsung";
        samsung.currentTemp = 25.5;
        samsung.mode = "greje";
        samsung.print();

        if(samsung.isHotterOutside(20))
        {
            System.out.println("Napolju je veca temperatura");
        }else {
            System.out.println("Napolju je manja temperatura");
        }


        SmartAirConditioning beko = new SmartAirConditioning();
        beko.brand = "Beko";
        beko.currentTemp = 21.0;
        beko.mode = "hladi";
        beko.print();

        if(beko.isHotterOutside(22))
        {
            System.out.println("Napolju je veca temperatura");
        }else {
            System.out.println("Napolju je manja temperatura");
        }


    }
}
