package p17_01_2023;

public class StudentOsnovnih extends Student {

    public StudentOsnovnih(String imeIPrezime, int index, int godinaStudija) {
        super(imeIPrezime, index, godinaStudija);
    }

    @Override
    public double cenaSkolarine() {
        return 90000;
    }
    @Override
    public boolean naBudzetu(){
        return this.godinaStudija < 5;
    }
}
