package Java_basic_Programs;
import java.util.Scanner;

public class RecursionInJava {
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1); // in recursion method calls itself.
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number who's factorial you want to find:");
        int n = sc.nextInt();
        System.out.println("The factorial of the given number "+n+" is : "+factorial(n));
    }
}
