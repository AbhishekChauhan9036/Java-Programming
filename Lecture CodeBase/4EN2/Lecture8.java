import java.util.*;
class Student{
    String name;
    int age;
    String address;
    long enrollmentnum;
    public void setDetails(String n, int a, String add, long enroll){
        this.name = n;
        this.age = a;
        this.address = add;
        this.enrollmentnum = enroll;
    }
    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
        System.out.println(this.enrollmentnum);
    }
}
public class Lecture8{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setDetails("Subani", 19, "Andhra Pradesh", 73876);
        s1.printDetails();
    }
}



/**
 *     // public static void main(String[] args){
    //     Vector<Integer> v1 = new Vector<>();
    //     v1.add(10);
    //     v1.add(20);
    //     v1.add(30);
    //     v1.add(40);
    //     System.out.println(v1);
    //     System.out.println(v1.capacity());
    //     System.out.println(v1.elementAt(3));

    //     Enumeration<Integer> e = v1.elements();
    //     while(e.hasMoreElements()){
    //         System.out.println(e.nextElement());
    //     }
    }
 */