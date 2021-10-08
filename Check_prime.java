package Java_basic_Programs;
import java.util.Scanner;

public class Check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check is it prime or not?");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2 ; i<=(n/2) ; i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(n+" is Prime number.");
        }
        else{
            System.out.println(n+" is not Prime number.");
        }
    }
}
