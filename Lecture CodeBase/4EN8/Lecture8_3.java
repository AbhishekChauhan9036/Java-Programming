class Outer{
    static class Inner{
        void print(){
            System.out.println("This is Inner Class Method");
        }

        static{
        System.out.println("This is static Block");
        }
    }
}
public class Lecture8_3{
    public static void main(String []args){
        Outer.Inner obj = new Outer.Inner();
        obj.print();
    }
}