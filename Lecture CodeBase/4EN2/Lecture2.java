import java.util.Scanner;
class Lecture2{
    public static void main(String args[]){
        // for(int i=1;i<=5;i++){
        //     System.out.println(i);
        // }

        // int i = 1;
        // while(i<=5){
        //     System.out.println(i);
        //     i++;
        // }

        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<=5);
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // double pi = sc.nextDouble();
        // float prize = sc.nextFloat();
        // String str = sc.next();
        // String sen = sc.nextLine();

        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(j>=6-i && j<=4+i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}