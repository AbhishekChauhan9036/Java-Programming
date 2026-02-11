import java.util.*;
public class Lecture6{
    public static void main(String[] args){
        // ArrayList<String> list = new ArrayList<>();
        // list.add("C++");
        // list.add("Java");
        // list.add("Python");

        // Iterator<String> it = list.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        // System.out.println(list);

        // Vector<String> v1 = new Vector<>();
        // v1.add("Akshitha");
        // v1.add("Cherry");
        // v1.add("Varun");

        // Enumeration<String> e = v1.elements();
        // while(e.hasMoreElements()){
        //     System.out.println(e.nextElement());
        // }

        // LinkedList<Integer> llist = new LinkedList<>();
        // llist.add(10);
        // llist.add(20);
        // llist.add(30);

        // ListIterator<Integer> li = llist.listIterator();
        // while(li.hasNext()){
        //     System.out.println(li.next());
        // }

        // while(li.hasPrevious()){
        //     System.out.println(li.previous());
        // }


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);

        System.out.println(list1);
        System.out.println(list2);
        list1.addAll(list2);
        System.out.println(list1);
    }
}