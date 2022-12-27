package p27_12_2022;

public class Zadatak2
{
    public static void main(String[] args)
    {
//        Krairti klasu SlackMessage koja ima:
//        tekst poruke
//        ime i prezime osobe koja je stavila poruku
//        datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//        U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//        [ime i prezime osobe] - [kad je poslata]
//        [Tekst poruke]

        SlackMessage firstMessage = new SlackMessage();
        firstMessage.text = "Hello";
        firstMessage.name = "Nemanja Nikolic";
        firstMessage.dateAndTime = "27.05.2022 20:20";
        firstMessage.printMessage();

        SlackMessage secondMessage = new SlackMessage();
        secondMessage.text = "Hey";
        secondMessage.name = "Petar Petrovic";
        secondMessage.dateAndTime = "27.05.2022 20:25";
        secondMessage.printMessage();

    }
}
