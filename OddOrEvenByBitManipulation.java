package Java_basic_Programs;
import java.util.*;
import java.lang.*;

public class OddOrEvenByBitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if((num & 1) == 0){
            System.out.println(num+" is even number.");
        }
        else{
            System.out.println(num+" is odd number.");
        }
    }
}
