package p27_12_2022;

public class Zadatak3
{
    public static void main(String[] args)
    {
//        Kreirati klasu Auto koja ima:
//        ime i prezime vozaca
//        marku automobila
//        broj vrata
//        potrosnju na 100km (npr: 10)
//        trenutnu brzinu kojom se auto krece
//        metodu za stampu koja stampa podatke u formatu:
//        [Vozac]
//	      [Marka] - [br vrata]-ro vrata
//        Sa potrosnjom od [potrosnja] l na 100km
//        [Trenutna brzina auta] km/h je trenutna brzina.

//        U okviru klase Auto, implementirati jos 2 metode:

//        metoda koja vraca informaciju da li je vozac prekoracio brzinu.
//        Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false
//        ako je trenutna brzina veca od ogranicenja.

//        metoda koja vraca visinu novcane kazne za prekoracenje,
//        za svaku jedinicu prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine

//        atribut godinu proizvodnje
//        atribut mesec do kad je registrovan auto (int)
//        atribut kubikaza auta (npr: 1600 - 5000)

//        metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.

//        metodu koja vraca da li je istekla registracije.
//        Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
//
//        metodu koja racuna i vraca cenu registracije za auto.
//        Za automobile do 2000 kubika cena registracije kubikaza * 100din, za automobile
//        preko 2000 kubika dodatno se uracunava 30% na cenu.



            Auto prviAuto = new Auto();
        prviAuto.vozac = "Nemanja Nikolic";
        prviAuto.marka = "BMW";
        prviAuto.brojVrata = 4;
        prviAuto.potrosnja = 8;
        prviAuto.trenutnaBrzina = 120;
        prviAuto.kubikaza = 2500;
        prviAuto.mesecReg = 9;
        prviAuto.godinaProizvodnje = 1980;
        prviAuto.printInfo();

       if(prviAuto.isItSpeeding(100))
       {
           System.out.println("Prekoracenje");
           System.out.println("Kazna za prekoracenje je " + prviAuto.ticketValue(100));
           System.out.println(" ");
       }
       else
       {
           System.out.println("Nije prekoracenje");
       }
        System.out.println(" ");

        System.out.println("Registracija kosta " + prviAuto.regValue());
        System.out.println(" ");

        if(prviAuto.isItOldtimer())
        {
            System.out.println("Auto je oldtimer");
        }
        else
        {
            System.out.println("Nije oldtimer");
        }
        System.out.println(" ");

        if(prviAuto.isItRegistred(11))
        {
            System.out.println("Registrovan je");
        }
        else {
            System.out.println("Nije registrovan");
        }
        System.out.println(" ");

        Auto drugiAuto = new Auto();
        drugiAuto.vozac = "Petar Nikolic";
        drugiAuto.marka = "Audi";
        drugiAuto.brojVrata = 4;
        drugiAuto.potrosnja = 9;
        drugiAuto.trenutnaBrzina = 80;
        drugiAuto.kubikaza = 1500;
        drugiAuto.mesecReg = 5;
        drugiAuto.godinaProizvodnje = 1922;
        drugiAuto.printInfo();

        if(drugiAuto.isItSpeeding(100))
        {
            System.out.println("Prekoracenje");
            System.out.println("Kazna za prekoracenje je " + drugiAuto.ticketValue(100));
        }
        else
        {
            System.out.println("Nije prekoracenje");
        }
        System.out.println(" ");

        System.out.println("Registracija kosta " + drugiAuto.regValue());
        System.out.println(" ");

        if(drugiAuto.isItOldtimer())
        {
            System.out.println("Auto je oldtimer");
        }
        else
        {
            System.out.println("Nije oldtimer");
        }
        System.out.println(" ");

        if(drugiAuto.isItRegistred(11))
        {
            System.out.println("Registrovan je");
        }
        else {
            System.out.println("Nije registrovan");
        }
        System.out.println(" ");



    }
}
