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

    public String brojReg;
    public boolean klimaRadi;
    public int maxBrzina;
    public int kapacitetRez;
    public int trenutnaKolGoriva;


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
    public void dodajGas(){
        if(trenutnaBrzina < maxBrzina)
        {
            trenutnaBrzina = trenutnaBrzina + 10;
        }else {
            trenutnaBrzina = maxBrzina;
        }

    }
    public void koci(){
        if(trenutnaBrzina > 0){
            trenutnaBrzina = trenutnaBrzina - 10;
        }
        else{
            trenutnaBrzina = 0;
        }
    }
    public double trenutnaPotrosnja(){
        double faktorKlime = 1.0;

        if(klimaRadi)
        {
            faktorKlime = 1.2;
        }
        return (trenutnaBrzina / 100.0 * potrosnja) * faktorKlime;
    }
    public void stampajTablu(){
        for (int i = 0; i < 100; i++) {
            int crtice = trenutnaBrzina * 100 / maxBrzina;
            if(crtice > i)
            {
                System.out.print("|");
            }
            else{
                System.out.print("-");
            }
        }
    }
    public double natociGorivo(int gorivo){
        int cenagoriva = 210;
        if(trenutnaKolGoriva < kapacitetRez)
        {
            trenutnaKolGoriva = trenutnaKolGoriva + gorivo;
            return gorivo * cenagoriva;

        }else {
            return (kapacitetRez - trenutnaKolGoriva) * cenagoriva;
        }
    }




}
