package Java_basic_Programs;
import java.lang.*;
import java.util.*;

public class Swap_two_numbers_by_bitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After swapping the numbers:");
        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);
    }
}
