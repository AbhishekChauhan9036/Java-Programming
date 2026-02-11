import java.util.*;
public class Lecture6{
    public static void main(String []args){
        // LinkedList <Integer> list1 = new LinkedList<>();
        // list1.add(10);
        // list1.add(20);
        // list1.add(30);
        // list1.add(40);
        // list1.add(50);
        // list1.add(0,5);
        // list1.addFirst(3);
        // System.out.println(list1);

        // ListIterator<Integer> li = list1.listIterator();
        // while(li.hasNext()){
        //     System.out.println(li.next());
        // }

        // while(li.hasPrevious()){
        //     System.out.println(li.previous());
        // }

        Vector <String> v1 = new Vector<>();
        v1.add("Gopi Chand");
        v1.add("Harsha");
        v1.add("Tarmisha");
        v1.add("Achinthya");
        v1.add("Madeshwar");
        System.out.println(v1);

        Vector <String> v2 = new Vector<>();
        v2.add("Karthik");
        v2.add("Venu Sai");
        v2.add("Uttam"); 
        v1.addAll(v2);
        System.out.println(v1);

        Enumeration<String> e = v1.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}