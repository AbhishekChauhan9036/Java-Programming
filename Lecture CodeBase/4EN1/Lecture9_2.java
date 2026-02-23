// Static Nested Class 
class Outer{
    static class Inner{
        void print(){
            System.out.println("This is Static Nested Class");
        }
        static{
            System.out.println("This is Static Block"); // Static Block
        }
    }
}

public class Lecture9_2{
    static{
        System.out.println("This is Inside Main Static Block"); // Static Block
    }
    public static void main(String[] args){
        Outer.Inner in = new Outer.Inner();
        in.print();
    }
}

