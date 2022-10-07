package Java_basic_Programs;
import java.util.Scanner;

public class Largest_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers:");
        int t = sc.nextInt();
        int big = -1;
        while(t-->0){
            System.out.println("Enter number:");
            int n = sc.nextInt();
            if (n > big){
                big = n;
            }
        }
        System.out.println("The biggest number among the given numbers is : "+big);
    }
}
