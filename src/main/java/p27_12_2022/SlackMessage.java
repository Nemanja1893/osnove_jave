package p27_12_2022;

public class SlackMessage
{
    public String text;
    public String name;
    public String dateAndTime;

    public void printMessage()
    {
        System.out.println(this.name + " - " + this.dateAndTime + ": " );
        System.out.println(text);
    }

}
