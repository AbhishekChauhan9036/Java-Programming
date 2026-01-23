import java.util.*;
class Lecture2{
  public static void main(String args[]){
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    // float prize = sc.nextFloat();
    // double pi = sc.nextDouble();
    // String name = sc.next();
    // String sentence = sc.nextLine();
    // char ch = sc.next().charAt(0); 

    // System.out.println(num);
    // System.out.println(prize);
    // System.out.println(pi);
    // System.out.println(name);
    // System.out.println(sentence);

    // for(int i = 1; i<=5; i++){
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

    for(int i = 1; i<=5; i++){
        for(int j=1; j<=9; j++){
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