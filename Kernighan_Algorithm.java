package BitManipulation;

import java.util.Scanner;

public class Kernighan_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int num = sc.nextInt();

        int counter = 0;
        while(num != 0){
            int rightMost_setBit = num & -num;
            num = num - rightMost_setBit;
            counter++;
        }

        System.out.println("The number of set bits in the number is : "+counter);
    }
}
