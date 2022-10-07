package Java_basic_Programs;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number to check whether it is Prime or Not?");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;
        boolean isPrime = true;
        for(int divisor = 2 ; divisor <= number/2 ; divisor++){
            if(temp % divisor == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("The given number "+number+" is Prime.");
        }
        else{
            System.out.println("The given number "+number+" is not Prime.");
        }
    }
}
