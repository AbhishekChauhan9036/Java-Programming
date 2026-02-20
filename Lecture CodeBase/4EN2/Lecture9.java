class Employee{
    public String name;
    public String address;
    public int empcode;
    public void setDetails(String name, String address){
        this.name = name;
        this.address = address;
    }
    public void setDetails(int empcode){
        this.empcode = empcode;
    }
    public void printDetails(){
        System.out.println("Employee Name: "+this.name);
        System.out.println("Employee Address: "+this.address);
        System.out.println("Employee Code: "+this.empcode);
    }
}
public class Lecture9{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setDetails("Mohan", "Gujarat");
        e1.setDetails(3784);
        e1.printDetails();
    }
}