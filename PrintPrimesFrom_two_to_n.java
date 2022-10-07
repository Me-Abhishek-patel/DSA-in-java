package Java_basic_Programs;
import java.util.Scanner;

public class PrintPrimesFrom_two_to_n {
    public static boolean isPrime(int n){
        int d=2;
        while(d<n){
            if(n % d == 0){
                return false;
            }
            d++;
        }
        return true;
    }
    public static void PrintPrime(int n){
        for(int i=2 ; i<=n ; i++){
            boolean is_prime = isPrime(i);
            if(is_prime){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        PrintPrime(num);
    }
}
