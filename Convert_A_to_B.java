package Java_basic_Programs;
import java.util.Scanner;

public class Convert_A_to_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int mask = a ^ b;
        int count = 0;
        while(mask != 0){
            mask = mask & (mask - 1);
            count++;
        }
        System.out.println("The number of bits to set to convert a to b is : "+count);
    }
}
