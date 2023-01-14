package p13_01_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String imeIPrezime;
    private String tekstObjave;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost(String imeIPrezime, String tekstObjave){
        this.reakcije = new ArrayList<>();
        this.imeIPrezime = imeIPrezime;
        this.tekstObjave = tekstObjave;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public String getTekstObjave() {
        return tekstObjave;
    }
    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }
    public void reaguj(Reakcija reakcija){
        for (int i = 0; i < this.reakcije.size(); i++) {
            if(this.reakcije.get(i).getImeIPrezimeKorisnika().equals(reakcija.getImeIPrezimeKorisnika())){
                this.reakcije.remove(i);
            }
        }
        this.reakcije.add(reakcija);
    }
    private int brojReakcija(String reakcija){
        int counter = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if(this.reakcije.get(i).getTip().equals(reakcija)){
                counter++;
            }
        }
        return counter;
    }


    public void stampaj(){
        System.out.println(this.imeIPrezime);
        System.out.println(this.tekstObjave);
        System.out.print("Smajli " + this.brojReakcija("smajli") + " | ");
        System.out.print("Like " + this.brojReakcija("like") + " | ");
        System.out.println("Srca " + this.brojReakcija("srce"));

    }

}
