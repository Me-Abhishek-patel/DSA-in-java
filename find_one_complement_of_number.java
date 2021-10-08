package BitManipulation;

import java.util.Scanner;

public class find_one_complement_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int n = num;

//        // finding the number of bits in the given number
//        int number_of_bits = (int) Math.floor(Math.log(n) / Math.log(2))+1;
//
//        // now generating the number which has same number of set bits as total bits present in given number.
//        int mask = (1 << number_of_bits) - 1;
//
//        // now we have to do XOR operation of given number with mask.
//        int one_complement_of_number = n ^ mask;
//        System.out.println("The one's complement of the given number "+num+" is : "+one_complement_of_number);

        int k = (int) (Math.log(num) / Math.log(2));
        for(int i=0 ; i<=k ; i++){
            int x = 1 << i;
            num = num ^ x;
        }

        System.out.println(num);
    }
}
