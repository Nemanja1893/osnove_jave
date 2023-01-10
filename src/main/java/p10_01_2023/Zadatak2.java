package p10_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

//        Zad Kreirati klasu Radnik koja ima:
//        jmbg radnika
//        ime i prezime
//        broj dece (1,2,3,... ili 0 ako nema dece)
//        stepen strucne spreme (od 1 do 8)
//        godine radnog staza
//        konstuktor koji postavlja samo jmbg
//        konstuktor koji postavlja sve atribute
//        getere i setere
//        metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//        metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//        metodu koja racuna platu radnika, plata se racuna po formuli:
//        25000 + (koeficijent slozenosti + minuli rad) * 10000
//        metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
//
//
//
//        Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//        - do 10 godina 0.05
//        - od 10-20 godina 0.075
//        - preko 20 godina 0.1

        Radnik r1 = new Radnik("13571654651165");
        r1.setIme("Pera");
        r1.setPrezime("Peric");
        r1.setBrojDece(2);
        r1.setGodineStaza(8);
        r1.setStrucnaSprema(5);
        System.out.println("Plata radnika je: " + r1.plataRadnika());
        if(r1.jeKreditnoSposoban()){
            System.out.println("Radnik " + r1.getIme() + " je kreditno sposoban");
        }
        else
        {
            System.out.println("Radnik " + r1.getIme() + " nije kreditno sposoban");
        }


        Radnik r2 = new Radnik("21212212212", "Joca", "Jocic",
                                2 , 12, 4);

        System.out.println("Plata radnika je: " +r2.plataRadnika());
        if(r1.jeKreditnoSposoban()){
            System.out.println("Radnik " +r2.getIme() + " je kreditno sposoban");
        }
        else
        {
            System.out.println("Radnik " +r2.getIme() + " nije kreditno sposoban");
        }
    }
}
