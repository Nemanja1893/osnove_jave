package p12_01_2023;

public class ZoomCall {
    private String link;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall(String link, Korisnik host, String password){
        this.link = link;
        this.host = host;
        this.password = password;
    }
    public String getLink() {
        return link;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public void pokreniPoziv(){
        System.out.println("Zoom call: " + link);
        System.out.println("Password: " + password);
        System.out.print("Host: " );
        host.stampaj();
        System.out.print("Guest: " );
        guest.stampaj();
        System.out.println("Maksimalno trajanje poziva je " + host.maxDuzinaCalla() + " min");
    }
}
