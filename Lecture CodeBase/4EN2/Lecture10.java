class Student{
    private String name; // Local Variable
    String address; // Local Variable
    static String collegename = "Marwadi University"; // Static Variable
}

public class Lecture10{
    static String collegename = "Marwadi University";// Static Variable
    public static void main(String[] args){
        System.out.println(collegename);
        System.out.println(Student.collegename);
    }
}