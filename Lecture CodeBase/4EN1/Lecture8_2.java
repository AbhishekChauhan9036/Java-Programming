// Method Overloading
class Student{
    String name;
    int age;
    public void setDetails(String n){
        name = n;
    }
    public void setDetails(int a){
        age = a;
    }
    public void printDetails(Student s1){
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
public class Lecture8_2{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setDetails("Rohan");
        s1.setDetails(22);
        s2.printDetails(s1);
    }
}