class Car{
    protected int gear;
    protected String color;
    protected int milage;
    protected String brand;
}
class Mercedes extends Car{
    public void setDetails(int gear, String color, int milage, String brand){
        this.gear = gear;
        this.color = color;
        this.milage = milage;
        this.brand = brand;
    }
    public void printDetails(){
        System.out.println("Number of Gear: "+this.gear);
        System.out.println("Car Color: "+this.color);
        System.out.println("Car Milage: "+this.milage+"KM");
        System.out.println("Car Brand: "+this.brand);
    }
}
public class Lecture13{
    public static void main(String[] args){
        Mercedes car1 = new Mercedes();
        car1.setDetails(5, "Black", 8, "Mercedes");
        car1.printDetails();
    }
}