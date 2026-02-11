import java.util.*;
public class Lecture5{
    public static void main(String[] args){
        // String str;
        // int a  = Integer.parseInt(args[0]);
        // System.out.println(a);
        // Autoboxing in Wrapper Class 
        // int a = 20;
        // Integer i = Integer.valueOf(a);
        // Integer j = a;
        // System.out.println(a +" "+ i + " "+ j);

        // //Unboxing in Wrapper Class
        // Integer x = new Integer(10);
        // int b = x.intValue();
        // int c = x;
        // System.out.println(x +" "+b +" "+ c);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(0,5);
        // System.out.println(list1);
        // System.out.println(list1.size());
        // System.out.println(list1.get(3));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.add(90);
        // System.out.println(list1);
        // System.out.println(list2);
        // list1.addAll(list2);
        // System.out.println(list1);
        // list1.clear();
        System.out.println(list1);
        System.out.println(list1.isEmpty());
        list1.remove(0);
        System.out.println(list1);
        list1.set(0,20);
        System.out.println(list1);

    }
}