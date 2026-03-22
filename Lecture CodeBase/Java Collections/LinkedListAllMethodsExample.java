import java.util.*;

public class LinkedListAllMethodsExample {

    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // ---------------- ADD METHODS ----------------

        // add(E e)
        list.add("Java");
        list.add("Python");
        list.add("C");
        System.out.println("After add(E): " + list);

        // add(int index, E element)
        list.add(1, "C++");
        System.out.println("After add(index, E): " + list);

        // addFirst(E e)
        list.addFirst("HTML");
        System.out.println("After addFirst(): " + list);

        // addLast(E e)
        list.addLast("JavaScript");
        System.out.println("After addLast(): " + list);

        // addAll(Collection c)
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Go");
        list2.add("Rust");
        list.addAll(list2);
        System.out.println("After addAll(Collection): " + list);

        // addAll(int index, Collection c)
        LinkedList<String> list3 = new LinkedList<>();
        list3.add("Kotlin");
        list3.add("Swift");
        list.addAll(2, list3);
        System.out.println("After addAll(index, Collection): " + list);

        // ---------------- ACCESS METHODS ----------------

        // element()
        System.out.println("element(): " + list.element());

        // get(int index)
        System.out.println("get(3): " + list.get(3));

        // getFirst()
        System.out.println("getFirst(): " + list.getFirst());

        // getLast()
        System.out.println("getLast(): " + list.getLast());

        // contains(Object o)
        System.out.println("contains(Java): " + list.contains("Java"));

        // indexOf(Object o)
        System.out.println("indexOf(Java): " + list.indexOf("Java"));

        // lastIndexOf(Object o)
        System.out.println("lastIndexOf(Java): " + list.lastIndexOf("Java"));

        // size()
        System.out.println("size(): " + list.size());

        // ---------------- QUEUE METHODS ----------------

        // offer(E e)
        list.offer("NodeJS");
        System.out.println("After offer(): " + list);

        // offerFirst(E e)
        list.offerFirst("CSS");
        System.out.println("After offerFirst(): " + list);

        // offerLast(E e)
        list.offerLast("React");
        System.out.println("After offerLast(): " + list);

        // peek()
        System.out.println("peek(): " + list.peek());

        // peekFirst()
        System.out.println("peekFirst(): " + list.peekFirst());

        // peekLast()
        System.out.println("peekLast(): " + list.peekLast());

        // ---------------- STACK METHODS ----------------

        // push(E e)
        list.push("STACK");
        System.out.println("After push(): " + list);

        // pop()
        System.out.println("pop(): " + list.pop());
        System.out.println("After pop(): " + list);

        // ---------------- REMOVE METHODS ----------------

        // poll()
        System.out.println("poll(): " + list.poll());
        System.out.println("After poll(): " + list);

        // pollFirst()
        System.out.println("pollFirst(): " + list.pollFirst());
        System.out.println("After pollFirst(): " + list);

        // pollLast()
        System.out.println("pollLast(): " + list.pollLast());
        System.out.println("After pollLast(): " + list);

        // remove()
        System.out.println("remove(): " + list.remove());
        System.out.println("After remove(): " + list);

        // remove(int index)
        list.remove(2);
        System.out.println("After remove(index): " + list);

        // remove(Object o)
        list.remove("Go");
        System.out.println("After remove(Object): " + list);

        // removeFirst()
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        // removeLast()
        list.removeLast();
        System.out.println("After removeLast(): " + list);

        // removeFirstOccurrence(Object o)
        list.add("Java");
        list.add("Java");
        list.removeFirstOccurrence("Java");
        System.out.println("After removeFirstOccurrence(): " + list);

        // removeLastOccurrence(Object o)
        list.removeLastOccurrence("Java");
        System.out.println("After removeLastOccurrence(): " + list);

        // ---------------- UPDATE METHODS ----------------

        // set(int index, E element)
        list.set(1, "UPDATED");
        System.out.println("After set(): " + list);

        // ---------------- ITERATORS ----------------

        // descendingIterator()
        System.out.print("Descending Iterator: ");
        Iterator<String> it = list.descendingIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // listIterator(int index)
        System.out.print("ListIterator from index 1: ");
        ListIterator<String> li = list.listIterator(1);
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        // ---------------- ARRAY CONVERSION ----------------

        // toArray()
        Object[] arr = list.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // toArray(T[] a)
        String[] strArr = list.toArray(new String[0]);
        System.out.println("toArray(T[]): " + Arrays.toString(strArr));

        // ---------------- CLONE & CLEAR ----------------

        // clone()
        LinkedList<String> cloneList = (LinkedList<String>) list.clone();
        System.out.println("Cloned List: " + cloneList);

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
