class Main{
    public static void main(String []args){
        int a = 10;
        int b = a++ + ++a - --a;
        System.out.println(a +" "+b);
    }
}