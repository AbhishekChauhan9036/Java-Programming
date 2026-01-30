import java.util.*;
class Lecture4{
    public static void main(String...args){
        String str = "Amzad Ali";
        String name = new String("Amzad Ali");
        System.out.println(str==name);
        System.out.println(str.equals(name));
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.substring(1,4));

        String fName = "Amzad";
        String lName = "Ali";
        String fullName = fName+" "+lName;
        System.out.println(fullName);
        System.out.println(fName.concat(lName));
        System.out.println(fName.indexOf('i'));
        System.out.println(fName.toUpperCase());
        System.out.println(fName.toLowerCase());

        String array[] = fName.split(" ");
        for(int i=0;i<array.length;i++){
             System.out.println(array[i]);
        }

        String str = new String("hello Marwadi how r u");
        char[] ch = new char[10]; 
        try{
            str.getChars(6, 15, ch, 0);
            System.out.println(ch);
            }catch(Exception ex){System.out.println(ex);}
        }
        double num = Math.random();
    }
}
