import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}






class EnumerationExample {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("Java");
        v.add("Python");
        v.add("C++");

        Enumeration<String> e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}





class ListIteratorExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        ListIterator<String> li = list.listIterator();

        System.out.println("Forward Direction:");
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("Backward Direction:");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
