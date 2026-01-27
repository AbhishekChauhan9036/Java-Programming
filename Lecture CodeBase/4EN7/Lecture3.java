import java.util.Scanner;
public class Lecture3{
    public static void main(String...args){
        int arr[]={1,2,3,4,5};
        int array[] = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        //User input 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();
        int brr[] = new int[n];
        System.out.print("Enter the Elements of an Array: ");
        for(int i=0;i<n;i++){
            brr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }

        int mat[][] ={{1,2},{3,4}};
        System.out.print(mat[0][0]+" ");
        System.out.print(mat[0][1]+" ");
        System.out.println();
        System.out.print(mat[1][0]+" ");
        System.out.print(mat[1][1]+" ");

        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

       String str1 = "Chandu Naidu";
       String str2 = new String("Chandu Naidu");
       System.out.println(str1 == str2);
       System.out.println(str1.equals(str2));
       System.out.println(str1.length());
       System.out.println(str1.charAt(2));
       System.out.println(str1.toUpperCase());
       System.out.println(str1.toLowerCase());
    }
}