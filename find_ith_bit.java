package Java_basic_Programs;
import java.util.*;
import java.lang.*;

public class find_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println("Enter the value of i:");
        int i = sc.nextInt();
        int mask = 1 << i;
        System.out.println("The result is:");
        System.out.println(mask | num);
    }
}
