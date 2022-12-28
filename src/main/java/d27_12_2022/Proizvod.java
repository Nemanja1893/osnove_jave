package d27_12_2022;

public class Proizvod {

    public String name;
    public double price;
    public double weightInG;

    public void print() {
        System.out.println(name + ", " + price + ", " + weightInG);
    }
    public double convertWeight(String type){
        if(type.equals("kg"))
        {
            return weightInG / 1000;
        } else if (type.equals("t")) {
            return weightInG / 100000;
        }
        return 0;
    }
}
