class Student{
    String name;
    int age;
    String address;
    public void setDetails(String n, int a, String add){
        name = n;
        age = a;
        address = add;
    }
    public void printDetails(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student Address: "+address);
    }
}
public class Lecture7{
    public static void main(String []args){
        Student s1 = new Student();
        s1.setDetails("Sai Charan", 20, "Kurnool");
        s1.printDetails();
    }
}