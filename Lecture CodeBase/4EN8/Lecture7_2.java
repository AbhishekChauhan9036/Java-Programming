class Employee{
    String name;
    int salary;
    public void setData(String n){
        name = n;
    }
    public void setData(int s){
        salary = s;
    }
    public void printDetails(){
        System.out.println("Employee's Name: "+name);
        System.out.println("Employee's Salary: "+salary);
    }
}
public class Lecture7_2{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setData("Rohan");
        e1.setData(10000);
        e1.printDetails();
    }
}