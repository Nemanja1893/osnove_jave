package p10_01_2023;

public class FacebookPost {
    private String post;
    private Korisnik korisnik;

    public FacebookPost(){

    }
    public FacebookPost(String post, Korisnik korisnik){
        this.post = post;
        this.korisnik = korisnik;
    }
    public void stampaj(){
        System.out.println(korisnik.getIme() + " " + korisnik.getPrezime());
        System.out.println(post);
    }
}
