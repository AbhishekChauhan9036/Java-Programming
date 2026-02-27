class Mobile{
    protected String name;
    protected String camera;
    protected int batterycapacity;
    protected double version;
}
class Iphone extends Mobile{
    public void setter(String name, String camera, int batterycapacity, double version){
        this.name = name;
        this.camera = camera;
        this.batterycapacity = batterycapacity;
        this.version = version;
    }
    public void getter(){
        System.out.println("Mobile Name: "+this.name);
        System.out.println("Camera: "+this.camera+"MP");
        System.out.println("Battery Capacity: "+this.batterycapacity+"Mah");
        System.out.println("Mobile Version: "+this.version);
    }
}
public class Lecture10{
    public static void main(String[] args){
        Iphone i1 = new Iphone();
        i1.setter("Iphone16 Pro","48",5000,16.001);
        i1.getter();
    }
}