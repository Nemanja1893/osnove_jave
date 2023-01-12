package p12_01_2023;

public class ViberReakcija {
    private String emoji;
    private ViberKorisnik reagovao;

    public ViberReakcija(String emoji, ViberKorisnik reagovao){
        this.emoji = emoji;
        this.reagovao = reagovao;
    }

    public String getEmoji() {
        return emoji;
    }
    public ViberKorisnik getReagovao() {
        return reagovao;
    }
}
