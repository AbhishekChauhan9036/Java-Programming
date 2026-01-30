import java.util.Scanner;
public class Lecture3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []arr = {1,2,3,4,5};
        int array[] = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();
        int aarray[] = new int[n];

        System.out.print("Enter the elements of an Array: ");
        for(int i=0;i<n;i++){
            aarray[i] = sc.nextInt();
        }

        System.out.print("the Array elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(aarray[i]+" ");
        }

        int mat[][] = {{1,2},{3,4}};
        System.out.print(mat[0][0]+" ");
        System.out.println(mat[0][1]+" ");
        System.out.print(mat[1][0]+" ");
        System.out.print(mat[1][1]+" ");

        int row = sc.nextInt();
        int column = sc.nextInt();
        float matrix[][] = new float[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = sc.nextFloat();
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        String name = "Akhil";
        String Name = new String("Akhil");
        System.out.println(name == Name);
        System.out.println(name.equals(Name));
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.substring(3));
    }
}