class Person{
    private String name;
    protected int age;
    protected String address;
    public int rollnumber;
    Person(String name){
        this.name = name;
    }
    void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
        System.out.println(this.rollnumber);
    }
}
class Student extends Person{
    Student(String name, int age, String address, int rollnumber){
        super(name);
        this.age = age;
        this.address = address;
        this.rollnumber = rollnumber;
    }
}
public class Lecture11_2{
    public static void main(String[] args){
        Student p1 = new Student("Krishna",20,"Karnataka",87328);
        p1.printDetails();
    }
}