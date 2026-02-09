import java.util.*;
public class Lecture6{
    public static void main(String...args){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(0,5);  // 5 10 20 30
        System.out.println(list);
        System.out.println(list.size());
        list.set(3,40); // 5 10 20 40
        System.out.println(list); 
        list.remove(2); // 5 10 40
        System.out.println(list); 
    }
}