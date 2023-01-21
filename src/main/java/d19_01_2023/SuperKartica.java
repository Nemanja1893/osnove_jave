package d19_01_2023;

public class SuperKartica {
    private int brojK;
    private String imeIPrezime;
    private int popst;
    public SuperKartica(){

    }
    public SuperKartica(int brojK, String imeIPrezime, int popst) {
        this.brojK = brojK;
        this.imeIPrezime = imeIPrezime;
        this.popst = popst;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public int getPopst() {
        return popst;
    }
    public void setPopst(int popst) {
        this.popst = popst;
    }
    public int getBrojK() {
        return brojK;
    }

    public void stampaj(){
        System.out.println(this.brojK + ", " + this.imeIPrezime);
    }
}
