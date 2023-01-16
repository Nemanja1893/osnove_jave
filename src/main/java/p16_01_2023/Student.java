package p16_01_2023;

public class Student extends Osoba {
    private int indeks;
    private int skolarina;

    public Student(String ime, String jmbg, int indeks, int skolarina){
        super(ime, jmbg);
        this.indeks = indeks;
        this.skolarina = skolarina;
    }
    public void uplatiSkolarinu(int uplata){
        this.skolarina -= uplata;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj indeksa" + " " + this.indeks);
        System.out.println("Trenutni dug za skolarinu: " + this.skolarina);
    }

}
