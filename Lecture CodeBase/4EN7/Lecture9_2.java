/**
 * import static java.lang.Math.*;
public class Lecture9_2{
    public static void main(String[] args){
        System.out.println((int)sqrt(15));
    }
}
 */

class IRCTC{
    private String username;
    private int age;
    private long PNRnumber;
    public void setter(String username, int age, long PNRnumber){
        this.username = username;
        this.age = age;
        this.PNRnumber = PNRnumber;
    }
    public void getter(){
        System.out.println("User Name: "+username);
        System.out.println("User Age: "+age);
        System.out.println("User PNR Number: "+PNRnumber);
    }
}
public class Lecture9_2{
    public static void main(String[] args){
        IRCTC ic = new IRCTC();
        ic.setter("Hansika", 19, 77734646);
        ic.getter();
    }
}