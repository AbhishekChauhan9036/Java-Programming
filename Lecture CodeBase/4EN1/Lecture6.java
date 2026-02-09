import java.util.*;
class Lecture6{
    public static void main(String...args){
        LinkedList<Integer> list1 = new LinkedList();
        list1.addFirst(5);
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.addLast(50);
        System.out.println(list1);

        // LinkedList<Integer> list2 = new LinkedList();
        // list2.add(11);
        // list2.add(12);
        // list2.add(13);
        // list2.addAll(list1);
        // System.out.println(list2);

        // list1.addAll(list2);
        // System.out.println(list1);

        // System.out.println(list1.get(0));
        // System.out.println(list1.getFirst());
        // System.out.println(list1.getLast());
        // System.out.println(list1.peek());
        // System.out.println(list1.peekFirst());
        // System.out.println(list1.peekLast());

        // System.out.println(list1.pop()); // 10
        // System.out.println(list1);  // 20 30

        // System.out.println(list1.poll());
        // System.out.println(list1);

        // 5 10 20 30 50 
        ListIterator<Integer> li =  list1.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        // 50 30 20 10 5
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}