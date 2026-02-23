class Student{
    String name;
    int age;
    String address;
    public void setDetails(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void printDetails(){
        System.out.println("Student Name: "+this.name);
        System.out.println("Student Age: "+this.age);
        System.out.println("Student Address: "+this.address);
    }
}
public class Lecture7{
    public static void main(String []args){
        Student s1 = new Student();
        s1.setDetails("Sai Charan", 20, "Kurnool");
        s1.printDetails();
    }
}