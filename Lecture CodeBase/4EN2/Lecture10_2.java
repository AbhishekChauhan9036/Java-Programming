// Nested Class 
class Outer{
    static class Inner{
        void print(){
            System.out.println("this is Nested Inner Class");
        }

        static{
            System.out.println("this is Static Block 1");
        }
    }
}
public class Lecture10_2{
    static{
        System.out.println("this is Static Block 2");
    }
    public static void main(String[] args){
        Outer.Inner obj = new Outer.Inner();
        obj.print();
    }
}