package p27_12_2022;

public class Auto
{
    public String vozac;
    public String marka;
    public int brojVrata;
    public int potrosnja;
    public int trenutnaBrzina;
    public int godinaProizvodnje;
    public int mesecReg;
    public int kubikaza;


    public void printInfo()
    {
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + " l na 100km");
        System.out.println(trenutnaBrzina + " km/h je trenutna brzina");
        System.out.println("--------------------");
        System.out.println(" ");
    }
    public boolean isItSpeeding(int limit)
    {
        if(this.trenutnaBrzina > limit)
        {
            return true;
        }
        return false;
    }
    public int ticketValue(int limit)
    {
        int ticket = this.trenutnaBrzina - limit;
        if(ticket > 0)
        {
            return ticket * 1000;
        }
        return 0;
    }
    public boolean isItRegistred(int month)
    {
        if(month < this.mesecReg)
        {
            return true;
        }
        return false;
    }
    public boolean isItOldtimer()
    {
        if(this.godinaProizvodnje < 1950)
        {
            return true;
        }
        return false;
    }
    public int regValue()
    {
        int value = 0;
        if(this.kubikaza < 2000)
        {
            value = this.kubikaza * 100;
        }
        else if (this.kubikaza > 2000)
        {
            value = ((this.kubikaza * 100) / 100) * 30;
        }
        return value;
    }




}
