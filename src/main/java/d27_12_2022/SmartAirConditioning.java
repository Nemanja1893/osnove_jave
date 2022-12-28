package d27_12_2022;

public class SmartAirConditioning {

    public String brand;
    public double currentTemp;
    public String mode;

    public void print() {
        System.out.println(brand + ", izabrana temperatura: " + currentTemp + " - " + mode);
    }
    public boolean isHotterOutside(double tmpOutside){
        return tmpOutside > currentTemp;
    }
}
