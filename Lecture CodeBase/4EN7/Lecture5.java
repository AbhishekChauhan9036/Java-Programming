import java.util.*;

public class Lecture5 {
    public static void main(String[] args) {

        /* ===================== ArrayList ===================== */

        ArrayList<Integer> a = new ArrayList<>();

        // add()
        a.add(10);
        a.add(20);
        a.add(30);

        // add(index, element)
        a.add(1, 15);

        // size()
        System.out.println("ArrayList Size: " + a.size());

        // get()
        System.out.println("ArrayList Element at index 2: " + a.get(2));

        // set()
        a.set(0, 5);

        // remove()
        a.remove(3);

        // contains()
        System.out.println("ArrayList Contains 20? " + a.contains(20));

        System.out.println("ArrayList: " + a);


        /* ===================== Vector ===================== */

        Vector<Integer> v = new Vector<>();

        // add()
        v.add(10);
        v.add(20);
        v.add(30);

        // addElement()
        v.addElement(40);

        // capacity()
        System.out.println("\nVector Capacity: " + v.capacity());

        // size()
        System.out.println("Vector Size: " + v.size());

        // get()
        System.out.println("Vector Element at index 1: " + v.get(1));

        // set()
        v.set(0, 5);

        // remove()
        v.remove(2);

        // contains()
        System.out.println("Vector Contains 20? " + v.contains(20));

        System.out.println("Vector: " + v);


        /* ===================== LinkedList ===================== */

        LinkedList<Integer> l = new LinkedList<>();

        // add()
        l.add(10);
        l.add(20);
        l.add(30);

        // addFirst()
        l.addFirst(5);

        // addLast()
        l.addLast(40);

        // size()
        System.out.println("\nLinkedList Size: " + l.size());

        // getFirst() and getLast()
        System.out.println("LinkedList First Element: " + l.getFirst());
        System.out.println("LinkedList Last Element: " + l.getLast());

        // removeFirst()
        l.removeFirst();

        // removeLast()
        l.removeLast();

        // contains()
        System.out.println("LinkedList Contains 20? " + l.contains(20));

        System.out.println("LinkedList: " + l);
    }
}
