package p17_01_2023;

import p16_01_2023.MasterKartica;
import p16_01_2023.VisaKartica;

public class Zadatak1 {
    public static void main(String[] args) {

        MasterKartica m = new MasterKartica(500,"15165-451551", 2025,2);
        VisaKartica v = new VisaKartica("Pera", 600,"23-321314", 2026,11);

        m.dodajSredstva(60);
        v.dodajSredstva(50);

        m.stampaj();
        v.stampaj();
    }
}
