/**
 * Arrays in Java
 */
import java.util.Scanner;
public class Lecture3{
    public static void main(String []args){
        // int arr[] = {1,2,3,4,5};
        // System.out.println(arr[4]);

        // int []brr = new int[5];
        // brr[0] = 1;
        // brr[1] = 2;
        // brr[2] = 3;
        // brr[3] = 4;
        // brr[4] = 5;
        // for(int i=0;i<brr.length;i++){
        //     System.out.print(brr[i]+" ");
        // }

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Size of an Array: ");
        // int n = sc.nextInt();
        // int array[] = new int[n];

        // System.out.print("Enter the Elements of an Array: ");
        // for(int i=0;i<n;i++){
        //     array[i] = sc.nextInt();
        // }

        // for(int i=0;i<n;i++){
        //     System.out.print(array[i]+" ");
        // }

        int mat[][] = {{1,2},{3,4}};
        System.out.println(mat[1][0]);
   
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j = 0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

    }
}