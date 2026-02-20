// import static java.lang.Math.*;
class Department{
    private String name;
    private String hod_name;
    private int capacity;
    private int numberofFaculty;
    public void setter(String name, String hod_name, int capacity, int numberofFaculty){
        this.name = name;
        this.hod_name = hod_name;
        this.capacity = capacity;
        this.numberofFaculty = numberofFaculty;
    }
    public void getter(){
        System.out.println("Department Name: "+this.name);
        System.out.println("Department' HOD: "+this.hod_name);
        System.out.println("Department Student's Capacity: "+this.capacity);
        System.out.println("Number of faculty: "+this.numberofFaculty);
    }
}
public class Lecture11{
    public static void main(String []args){
        // int num = 81;
        // int ans = (int)(sqrt(num));
        // System.out.println(ans);
        Department d1 = new Department();
        d1.setter("AI, ML & DS", "Dr. Madhu Shukla", 10000, 120);
        d1.getter();
    }
}