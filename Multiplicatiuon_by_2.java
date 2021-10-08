package Java_basic_Programs;
import java.lang.*;
import java.util.*;

public class Multiplicatiuon_by_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("After multiplication:");
        num = num << 1;
        System.out.println(num);
    }
}
