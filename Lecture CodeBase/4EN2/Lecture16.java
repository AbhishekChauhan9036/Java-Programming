/**
 * Multilevel Inheritance
 */
class Vehicle{
    protected int mileage;
    protected String brand;
    protected String color;
}
class Twowheeler extends Vehicle{
    public void setter(int mileage, String brand, String color){
        this.mileage = mileage;
        this.brand = brand;
        this.color = color;
    }
}
class Fourwheeler extends Twowheeler{
    public void getter(){
        System.out.println("Brand Name: "+this.brand);
        System.out.println("Mileage: "+this.mileage+"KM/Hrs");
        System.out.println("Color: "+this.color);
    }
}
public class Lecture16{
    public static void main(String[] args){
        Fourwheeler f1 = new Fourwheeler();
        f1.setter(15,"BMW","White");
        f1.getter();
        final double pi = 3.1416;
    }
}