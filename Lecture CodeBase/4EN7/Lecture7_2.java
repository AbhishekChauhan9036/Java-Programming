//Method Overloading
class Person{
    String name;
    int age;
    public String setDetails(String n){
        name = n;
        return name;
    }
    public int setDetails(int a){
        age = a;
        return age;
    }
}
public class Lecture7_2{
    public static void main(String []args){
        Person p1 = new Person();
        System.out.println(p1.setDetails("Praveen"));
        System.out.println(p1.setDetails(19));
    }
}