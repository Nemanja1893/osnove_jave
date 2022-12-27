package d26_12_2022;

public class Zadatak5
{
    public static void main(String[] args)
    {
//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.


        stampajZnak(5, "*");
        stampajZnak(10, "-");
    }
    public static void stampajZnak(int n, String karakter)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter);
        }
        System.out.println(" ");
    }
}
