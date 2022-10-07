package Java_basic_Programs;
import java.util.Scanner;

public class RotatedTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:-");
        int row = sc.nextInt();
        System.out.println("Enter number of columns:-");
        int col = sc.nextInt();

        for(int i=1 ; i<=(row/2)+1 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

         for(int i=(row/2)+1 ; i>1 ; i--){
             for(int j=1 ; j<i ; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
