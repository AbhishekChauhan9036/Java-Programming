class Student{
    Student(){}
    private String name;
    void setData(String name){
        this.name = name;
    }
}

public class Revision{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData("Rohan");
    }
}