import java.util.*;
import java.util.function.Predicate;

public class ArrayListAllMethodsFullExample {

    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> list = new ArrayList<>();

        // ---------------- ADD METHODS ----------------

        // add(E e)
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("Java");
        System.out.println("After add(E): " + list);

        // add(int index, E element)
        list.add(1, "C++");
        System.out.println("After add(index, E): " + list);

        // addAll(Collection c)
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Go");
        list2.add("Rust");
        list.addAll(list2);
        System.out.println("After addAll(Collection): " + list);

        // addAll(int index, Collection c)
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Kotlin");
        list3.add("Swift");
        list.addAll(2, list3);
        System.out.println("After addAll(index, Collection): " + list);

        // ---------------- ACCESS METHODS ----------------

        // get(int index)
        System.out.println("Element at index 3: " + list.get(3));

        // contains(Object o)
        System.out.println("Contains Java? " + list.contains("Java"));

        // indexOf(Object o)
        System.out.println("Index of Java: " + list.indexOf("Java"));

        // lastIndexOf(Object o)
        System.out.println("Last index of Java: " + list.lastIndexOf("Java"));

        // size()
        System.out.println("Size of list: " + list.size());

        // isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // ---------------- UPDATE METHODS ----------------

        // set(int index, E element)
        list.set(0, "JAVA");
        System.out.println("After set(): " + list);

        // replaceAll(UnaryOperator)
        list.replaceAll(e -> e.toLowerCase());
        System.out.println("After replaceAll(): " + list);

        // sort(Comparator)
        list.sort(Comparator.naturalOrder());
        System.out.println("After sort(): " + list);

        // ---------------- REMOVE METHODS ----------------

        // remove(int index)
        list.remove(2);
        System.out.println("After remove(index): " + list);

        // remove(Object o)
        list.remove("java");
        System.out.println("After remove(Object): " + list);

        // removeAll(Collection c)
        ArrayList<String> removeList = new ArrayList<>();
        removeList.add("go");
        removeList.add("rust");
        list.removeAll(removeList);
        System.out.println("After removeAll(): " + list);

        // removeIf(Predicate)
        list.removeIf(e -> e.length() <= 4);
        System.out.println("After removeIf(): " + list);

        // retainAll(Collection c)
        ArrayList<String> retainList = new ArrayList<>();
        retainList.add("python");
        list.retainAll(retainList);
        System.out.println("After retainAll(): " + list);

        // ---------------- RANGE & SUBLIST ----------------

        list.add("java");
        list.add("c++");
        list.add("kotlin");
        System.out.println("Updated list: " + list);

        // subList(int fromIndex, int toIndex)
        List<String> sub = list.subList(1, 3);
        System.out.println("SubList: " + sub);

        // ---------------- CAPACITY METHODS ----------------

        // ensureCapacity(int)
        list.ensureCapacity(20);
        System.out.println("Capacity ensured");

        // trimToSize()
        list.trimToSize();
        System.out.println("Capacity trimmed");

        // ---------------- CLONE & ARRAY ----------------

        // clone()
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // toArray()
        Object[] arr = list.toArray();
        System.out.print("Array elements: ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // ---------------- SPLITERATOR ----------------

        Spliterator<String> sp = list.spliterator();
        System.out.print("Using Spliterator: ");
        sp.forEachRemaining(e -> System.out.print(e + " "));
        System.out.println();

        // ---------------- CLEAR ----------------

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is list empty now? " + list.isEmpty());
    }
}
