package p17_01_2023;

public abstract class Student {
    protected String imeIPrezime;
    protected int index;
    protected int godinaStudija;

    public Student(String imeIPrezime, int index, int godinaStudija) {
        this.imeIPrezime = imeIPrezime;
        this.index = index;
        this.godinaStudija = godinaStudija;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getIndex() {
        return index;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public abstract double cenaSkolarine();
    public abstract boolean naBudzetu();

    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.godinaStudija);

        if(naBudzetu()){
            System.out.println("Finansiranje: Budzet");

        }
        else {
            System.out.println("Finansiranje: Samofinansiranje");

        }
        System.out.println("Skolarina: " + cenaSkolarine());
    }
}
