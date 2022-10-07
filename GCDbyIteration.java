package Java_basic_Programs;
import java.util.Scanner;

public class GCDbyIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number :");
        int number1 = sc.nextInt();
        System.out.println("Enter your second number :");
        int number2 = sc.nextInt();

        int gcd = 1;
        int k = 2;
        while(k <= number1 && k <= number2){
            if(number1 % k == 0 && number2 % k == 0){
                gcd = k;
            }
            k++;
        }
        System.out.println("The gcd of "+number1+" and "+number2+" is "+gcd);
    }
}
