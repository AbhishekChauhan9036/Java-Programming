class Student{
    String name;
    int id;
    String address;
    // Default Constructor
    Student(){
        System.out.println("This is default Constuctor");
    }
    //Parameterized  Constructor
    Student(String name, int id, String address){
        this();
        this.name = name;
        this.id = id;
        this.address = address;
    }
    // public void setDetails(String n, int i, String add){
    //     name = n;
    //     id = i;
    //     address = add;
    // }
    public void printDetails(){
        System.out.println("Student Name: "+this.name);
        System.out.println("Student ID: "+this.id);
        System.out.println("Student Address: "+this.address);
    }
}

public class Lecture7{
    public static void main(String[] args){
        Student s1 = new Student("Gopi Chand",3767, "Andhra Pradesh");
        // s1.setDetails("Gopi Chand",3767, "Andhra Pradesh");
        s1.printDetails();
    }
}