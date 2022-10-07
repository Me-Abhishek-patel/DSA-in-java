package Java_basic_Programs;
import java.util.Scanner;
import java.math.*;

public class PyramidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows :");
        int row = sc.nextInt();
        System.out.println("Enter number of columns :");
        int col = sc.nextInt();

        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= (col - i) ; j++){
                System.out.print(" ");
            }
            int power = 0;
            for(int j = 1 ; j <= i ; j++){
                System.out.print((int)Math.pow(3,power));
                power++;
            }
            System.out.println();

        }
    }
}
