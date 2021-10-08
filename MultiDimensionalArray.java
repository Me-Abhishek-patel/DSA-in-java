package Java_basic_Programs;
import java.util.*;
import java.lang.*;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:");
        int row = sc.nextInt();
        System.out.println("Enter col:");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements of the 2-d array:");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The entered elements are:");

        // by using normal for loop
//        for(int i=0 ; i<row ; i++){
//            for(int j=0 ; j<col ; j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }


        //by using toString method in java
//        for(int i=0 ; i<matrix.length ; i++){
//            System.out.println(Arrays.toString(matrix[i]));
//        }


        // by using for-each loop
        for(int[] val : matrix){
            for(int val1 : val){
                System.out.print(val1+" ");
            }
            System.out.println();
        }

   }
}
