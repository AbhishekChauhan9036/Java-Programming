import java.util.*;
class Lecture5{
    public static void main(String...args){
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(0,5);      // 5 10 20 30
        // System.out.println(list);
        // System.out.println(list.get(1));
        // list.add(40);
        // System.out.println(list.size());
        // list.set(0,6);
        // System.out.println(list);  // 6 10 20 30 40
        // list.remove(3);
        // System.out.println(list); 
        // System.out.println(list.contains(30));
        // list.clear();
        // System.out.println(list); 
        // System.out.println(list.isEmpty()); 

        LinkedList<Integer> ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(1,30);
        ll.addFirst(5);
        ll.addLast(50);
        System.out.println(ll);  // 5 30 10 20 50
    }
}