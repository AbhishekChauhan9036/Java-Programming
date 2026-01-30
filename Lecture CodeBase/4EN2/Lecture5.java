public class Lecture5{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("University");
        System.out.println(sb.length());
        // sb.append("University");
        System.out.println(sb.capacity());
        sb.insert(0,"Marwadi");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        // MarwadiUniversity
        // sb.delete(5,7);
        System.out.println(sb);
        sb.replace(0,7,"Delhi");
        System.out.println(sb);
        // DelhiUniversity
        System.out.println(sb.indexOf("i"));
        System.out.println(sb.lastIndexOf("i"));


        // Autoboxing in Wrapper Class
        int a = 20;
        Integer i = Integer.valueOf(a);
        Integer j = a;
        System.out.println(a+" "+i+" "+j);

        //Unboxing in Wrapper Class
        Integer x = new Integer(2);
        int k = x.intValue();
        int y = x;
        System.out.println(x + " "+y+" "+k);

        System.out.println(args[0]);
    }
}