package Java_basic_Programs;
import java.util.Scanner;

public class Addition_Of_two_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows in first matrix:");
        int row1 = sc.nextInt();
        System.out.println("Enter number of col in first martrix:");
        int col1 = sc.nextInt();
        int[][] a = new int[row1][col1];
        System.out.println("Enter the elements of the first matrix:");
        for(int i=0 ; i<row1 ; i++){
            for(int j=0 ; j<col1 ; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows in second matrix:");
        int row2 = sc.nextInt();
        System.out.println("Enter number of col in second matrix:");
        int col2 = sc.nextInt();
        int[][] b = new int[row2][col2];
        System.out.println("Enter the elements of the second matrix:");
        for(int i=0 ; i<row2 ; i++){
            for(int j=0 ; j<col2 ; j++){
                b[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[row1][col1];
        if(row1 == row2 && col1 == col2){
            for(int i=0 ; i<row1 ; i++){
                for(int j=0 ; j<col1 ; j++){
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("The sum of the two matrix is:");
            for(int i=0 ; i<row1 ; i++){
                for(int j=0 ; j<col1 ; j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Addition is not possible.");
        }
    }
}
