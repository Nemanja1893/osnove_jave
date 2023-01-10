package p10_01_2023;

public class Zadatak5 {
    public static void main(String[] args) {

        ClanskaKarta kartica = new ClanskaKarta(10, "156355");
        Kupac kupac = new Kupac("Nemanja Nikolic", kartica);
        Proizvod p1 = new Proizvod("TV", kupac, 325);
        p1.stampaj();
    }
}
