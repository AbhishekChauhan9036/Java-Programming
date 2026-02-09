import java.util.ArrayList;
import java.util.Collections; // Import Collections class for sorting

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        // ArrayList<Type> listName = new ArrayList<>();
        // Note: ArrayList only stores objects (Wrapper classes), not primitives (int,
        // char, etc.)
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        System.out.println("Initial List: " + fruits);

        // 3. Access elements using get(index)
        String fruit = fruits.get(1); // Index starts at 0
        System.out.println("Element at index 1: " + fruit);

        // 4. Modify elements using set(index, mixed value)
        fruits.set(2, "Blueberry"); // Change "Cherry" to "Blueberry"
        System.out.println("After modification: " + fruits);

        // 5. Remove elements
        fruits.remove(0); // Remove by index
        fruits.remove("Mango"); // Remove by object
        System.out.println("After removal: " + fruits);

        // 6. Check size
        System.out.println("Size of list: " + fruits.size());

        // 7. Loop through the ArrayList
        System.out.print("Iterating: ");
        for (String f : fruits) {
            System.out.print(f + " ");
        }
        System.out.println();

        // 8. Sorting
        // Add more elements to show sorting better
        fruits.add("Orange");
        fruits.add("Grape");

        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

        // 9. Clear the list
        fruits.clear();
        System.out.println("After clearing, is list empty? " + fruits.isEmpty());

        // Example with Integer (Wrapper class for int)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("Number List: " + numbers);
    }
}
