package Java_basic_Programs;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:-");
        int n = sc.nextInt();
        int space = n;
        int number = 1;

        for(int i=0 ; i<n ; i++){
            //nested loop for printing spaces
            for(int s=1 ; s<=space ; s++){
                System.out.print(" ");
            }

            number = 1;
            for(int j=0 ; j<=i ; j++){
                System.out.print(number+" ");
                number = number * (i-j)/(j+1);
            }
            space--;
            System.out.println();
        }
    }
}
