class Student{
    static String department = "AI ML & DS";
    static String collegename = "Marwadi University";
    public String name;
    public int id;
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void printDetails(){
        System.out.println("Student Name: "+this.name);
        System.out.println("Student ID: "+this.id);
        System.out.println("Department Name: "+department);
        System.out.println("College Name: "+collegename);
    }
}

public class Lecture8_2{
    public static void main(String []args){
        Student s1 = new Student("Lokesh",737284);
        s1.printDetails();
    }
}