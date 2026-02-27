class Student{
    private String name;
    private int age;
    public void setter(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class Lecture10{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setter("Suresh",20);
    }
}


/**
 * import static java.lang.Math.*;
public class Lecture10{
    public static void main(String[] args){
        System.out.println((int)sqrt(81));
        System.out.println(max(100,230));
        System.out.println(min(100,230));
        System.out.println(pow(2,3));
    }
}
 */