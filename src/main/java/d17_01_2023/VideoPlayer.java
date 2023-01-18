package d17_01_2023;

public class VideoPlayer {
    private double lenght;
    private double currentTime;
    private double volume;
    private int quality;

    public VideoPlayer(double lenght, double currentTime, double volume, int quality) {
        this.lenght = lenght;
        this.currentTime = currentTime;
        this.volume = volume;
        this.quality = quality;
    }
    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getCurrentTime() {
        return currentTime;
    }
    public void setCurrentTime(double currentTime) {
        this.currentTime = currentTime;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public int getQuality() {
        return quality;
    }
    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void print(){
        System.out.println("Current video time: " + this.currentTime);
        System.out.println("Volume: " + this.volume);
        System.out.println("Video quality: " + this.quality);

    }
}
