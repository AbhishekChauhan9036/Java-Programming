import java.util.*;
public class Lecture7{
    public static void main(String[] args){
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(10);
        // list1.add(20);
        // list1.add(30);
        // list1.add(40);
        // list1.add(50);
        // list1.add(0,5);
        // System.out.println(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(60);
        // list2.add(70);

        // list1.addAll(list2);
        // System.out.println(list1);
        // System.out.println(list1.get(6));
        // // list1.clear();
        // System.out.println(list1.isEmpty());
        // list1.remove(6);
        // System.out.println(list1);
        // System.out.println(list1.contains(100));

        // Iterator<Integer> it =  list1.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        LinkedList<String> LL1 = new LinkedList<>();
        LL1.add("Teja");
        LL1.add("Supriya");
        LL1.add("Juhi");
        LL1.add("Ali");
        LL1.add("Sathwik");
        System.out.println(LL1);
        LL1.set(0,"Ritika");
        System.out.println(LL1);
        System.out.println(LL1.size());

        ListIterator<String> li = LL1.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}