package d29_12_2022;

public class Proizvod {

    private String name;
    private double price;
    private double weight;

    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public void stampaj(){
        System.out.println(name + ", " + price + ", " + weight);
    }
    public void povecajCenu(double povecanje){
        price = price + povecanje;
    }
    public double vratiCenuSaPopustom(double popust){

        double popustOdCene = (price * popust) / 100;
        return price - popustOdCene;
    }
    public double racunajPostarinu(){

        if(weight <= 100.0){
            return 200.0;
        } else if (weight > 100.0 && weight <= 500.0 ) {
            return 400.0;
        } else if (weight > 500.0) {
            return 1000.0;
        }else {
            return 0;
        }
    }

}
