package d29_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu FacebookPost koja ima:
//        Od atributa:
//        ime i prezime korisnika koji je objavio post
//        ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//        tekst objave
//        broj lajkova
//        broj deljenja
//        gettere za sve atribute
//        settere za sve atribute osim broja lajkova i broja deljenja
//        Od metoda:
//        like(), koja povecava broj lajkova za 1.
//        dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//        share(), koja povecava broj deljenja za 1
//        print(), koja stampa objavu u formatu:
//        (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//        (tekst objave)
//        Likes (broj lajkova) | Shares (broj deljenja)

        FacebookPost firstPost = new FacebookPost();
        firstPost.setName("Nemanja Nikolic");
        firstPost.setFriendName("Petar Petrovic");
        firstPost.setText("Ovo je prvi tekst");

        firstPost.like();
        firstPost.like();
        firstPost.like();
        firstPost.dislike();
        firstPost.share();
        firstPost.print();

        System.out.println("-------------------");

        FacebookPost secondPost = new FacebookPost();
        secondPost.setName("Marko Markovic");
        secondPost.setFriendName("Petar Petrovic");
        secondPost.setText("Ovo je drugi tekst");

        secondPost.like();
        secondPost.like();
        secondPost.dislike();
        secondPost.share();
        secondPost.share();
        secondPost.print();
    }
}
