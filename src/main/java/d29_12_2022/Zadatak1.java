package d29_12_2022;



public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//                cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//        Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//                vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//                a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
//                Smatrati da je parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//        Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400din
//        za tezinu preko 500g, postarina iznosi 1000din

        Proizvod tv = new Proizvod();
        tv.setName("TV");
        tv.setPrice(324.0);
        tv.setWeight(4500.0);

        tv.stampaj();
        tv.povecajCenu(10);
        tv.povecajCenu(25.5);
        tv.racunajPostarinu();
        System.out.println("Cena sa popustom: " + tv.vratiCenuSaPopustom(20));
        System.out.println("Postarina iznosi: " + tv.racunajPostarinu());

        Proizvod tastatura = new Proizvod();
        tastatura.setName("Tastatura");
        tastatura.setPrice(150.0);
        tastatura.setWeight(423.0);


        System.out.println("----------------------");

        tastatura.stampaj();
        tastatura.povecajCenu(15);
        tastatura.povecajCenu(10);
        tastatura.racunajPostarinu();
        System.out.println("Cena sa popustom: " + tastatura.vratiCenuSaPopustom(20));
        System.out.println("Postarina iznosi: " + tastatura.racunajPostarinu());
    }
}
