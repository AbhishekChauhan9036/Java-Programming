class Resturant{
    public String name;
    public String location;
    public double rating;
    public int GSTid;
}
class Staff extends Resturant{
    private int receptionist;
    private int numberofwaiter;
    private String managername;
}
class Customer extends Staff{
    public int customerbill;
    void setter(){

    }
    void getter(){
        
    }
}
public class Lecture11_3{
    public static void main(String[] args){
        Customer c1 = new Customer();
    }
}