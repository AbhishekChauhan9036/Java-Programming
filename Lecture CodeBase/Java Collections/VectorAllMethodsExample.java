import java.util.*;
import java.util.function.Predicate;

public class VectorAllMethodsExample {

    public static void main(String[] args) {

        // Creating Vector
        Vector<String> v = new Vector<>();

        // ---------------- ADD METHODS ----------------

        v.add("Java");                    // add()
        v.add("Python");
        v.addElement("C");               // addElement()
        System.out.println("After add & addElement: " + v);

        Vector<String> v2 = new Vector<>();
        v2.add("C++");
        v2.add("Go");

        v.addAll(v2);                    // addAll()
        System.out.println("After addAll(): " + v);

        // ---------------- CAPACITY METHODS ----------------

        System.out.println("Capacity: " + v.capacity()); // capacity()

        v.ensureCapacity(20);            // ensureCapacity()
        System.out.println("Capacity after ensureCapacity: " + v.capacity());

        // ---------------- ACCESS METHODS ----------------

        System.out.println("elementAt(1): " + v.elementAt(1));
        System.out.println("firstElement(): " + v.firstElement());
        System.out.println("lastElement(): " + v.lastElement());
        System.out.println("get(2): " + v.get(2));

        // ---------------- SEARCH METHODS ----------------

        System.out.println("contains(Java): " + v.contains("Java"));
        System.out.println("containsAll(v2): " + v.containsAll(v2));
        System.out.println("indexOf(Java): " + v.indexOf("Java"));
        System.out.println("lastIndexOf(Java): " + v.lastIndexOf("Java"));

        // ---------------- ENUMERATION ----------------

        System.out.print("Using Enumeration: ");
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        // ---------------- ITERATORS ----------------

        System.out.print("Using Iterator: ");
        Iterator<String> it = v.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.print("Using ListIterator: ");
        ListIterator<String> li = v.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        // ---------------- UPDATE METHODS ----------------

        v.set(1, "UPDATED");              // set()
        v.setElementAt("SET-C", 2);       // setElementAt()
        System.out.println("After set methods: " + v);

        v.replaceAll(s -> s.toLowerCase()); // replaceAll()
        System.out.println("After replaceAll(): " + v);

        // ---------------- REMOVE METHODS ----------------

        v.remove("go");                   // remove(Object)
        System.out.println("After remove(Object): " + v);

        v.removeElement("c++");           // removeElement()
        System.out.println("After removeElement(): " + v);

        v.removeElementAt(1);             // removeElementAt()
        System.out.println("After removeElementAt(): " + v);

        Vector<String> removeList = new Vector<>();
        removeList.add("java");

        v.removeAll(removeList);          // removeAll()
        System.out.println("After removeAll(): " + v);

        v.add("java");
        v.add("python");
        v.add("c");

        v.removeIf(s -> s.length() == 1); // removeIf()
        System.out.println("After removeIf(): " + v);

        v.removeAllElements();             // removeAllElements()
        System.out.println("After removeAllElements(): " + v);

        // ---------------- SIZE METHODS ----------------

        v.add("one");
        v.add("two");
        v.add("three");

        System.out.println("Size: " + v.size()); // size()
        System.out.println("Is Empty: " + v.isEmpty());

        v.setSize(5);                     // setSize()
        System.out.println("After setSize(): " + v);

        // ---------------- SUBLIST & SORT ----------------

        v.set(3, "four");
        v.set(4, "five");

        List<String> sub = v.subList(1, 4); // subList()
        System.out.println("SubList: " + sub);

        v.sort(Comparator.naturalOrder()); // sort()
        System.out.println("After sort(): " + v);

        // ---------------- ARRAY & STRING ----------------

        Object[] arr = v.toArray();        // toArray()
        System.out.println("toArray(): " + Arrays.toString(arr));

        System.out.println("toString(): " + v.toString());

        // ---------------- CLONE & COPY ----------------

        Vector<String> cloneVec = (Vector<String>) v.clone(); // clone()
        System.out.println("Cloned Vector: " + cloneVec);

        String[] copyArr = new String[v.size()];
        v.copyInto(copyArr);               // copyInto()
        System.out.println("copyInto(): " + Arrays.toString(copyArr));

        // ---------------- SPLITERATOR ----------------

        System.out.print("Using Spliterator: ");
        Spliterator<String> sp = v.spliterator();
        sp.forEachRemaining(x -> System.out.print(x + " "));
        System.out.println();

        // ---------------- TRIM & CLEAR ----------------

        v.trimToSize();                    // trimToSize()
        System.out.println("After trimToSize, capacity: " + v.capacity());

        v.clear();                         // clear()
        System.out.println("After clear(): " + v);
    }
}
