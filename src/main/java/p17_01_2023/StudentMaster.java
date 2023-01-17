package p17_01_2023;

public class StudentMaster extends Student{

    public StudentMaster(String imeIPrezime, int index, int godinaStudija) {
        super(imeIPrezime, index, godinaStudija);
    }
    @Override
    public double cenaSkolarine(){
        return 100000;
    }
    @Override
    public boolean naBudzetu(){
        return this.godinaStudija < 2;
    }
}
