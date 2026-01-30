public class Lecture4{
    public static void main(String []args){
        // StringBuffer sb = new StringBuffer("Java");
        // System.out.println(sb);
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        // sb.append("Programmingo");
        // System.out.println(sb);
        // sb.insert(0,"I Love");
        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);
        // sb.reverse();
        // sb.delete(0,6);
        // System.out.println(sb);
        // sb.replace(0,4,"C++");
        // System.out.println(sb);
        // // C++Programmingo
        // System.out.println(sb.indexOf("o"));
        // System.out.println(sb.lastIndexOf("o"));
        // System.out.println(sb.substring(3));

        // Autoboxing in Wrapper Class
        int a = 20;
        Integer i = Integer.valueOf(a);
        Integer j = a;
        System.out.println(a+ " " + i + " " + j);

        //Unboxing in Wrapper Clss
        Integer x = new Integer(5);
        int k = x.intValue();
        int y = x;
        System.out.println(x + " " + k + " " + y);
    }
}