public class Lecture4 { 
    public static void main(String[] args) { 
       String str1 = "Aman";
       String str2 = new String("Aman");
       System.out.println(str1 == str2);
       System.out.println(str1.equals(str2));
       System.out.println(str1.length());
       System.out.println(str1.charAt(2));
       System.out.println(str1.toUpperCase());
       System.out.println(str1.toLowerCase());

        StringBuffer sb = new StringBuffer("Java");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Programmingo");
        System.out.println(sb);
        sb.insert(0,"I Love");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(0,6);
        System.out.println(sb);
        sb.replace(0,4,"C++");
        System.out.println(sb);
        // C++Programmingo
        System.out.println(sb.indexOf("o"));
        System.out.println(sb.lastIndexOf("o"));
        System.out.println(sb.substring(3));
    } 
} 