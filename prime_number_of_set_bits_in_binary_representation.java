package BitManipulation;

import java.util.Scanner;

public class prime_number_of_set_bits_in_binary_representation {
    public static int setBits(int n){

        int count = 0;
        while(n != 0){

            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static boolean isPrime(int m){

        boolean is_prime = true;

        for(int i=2 ; i * i <= m ; i++){

            if(m % i == 0){

                is_prime = false;
            }
        }
        return is_prime;
    }

    public static int countPrimeSetBits(int left, int right) {

        int countPrime = 0;

        for(int i=left ; i<=right ; i++){

            int res1 = setBits(i);
            boolean res = isPrime(res1);

            if(res){

                countPrime++;
            }
        }
        return countPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter left:");
        int left = sc.nextInt();

        System.out.println("Enter right:");
        int right = sc.nextInt();

        System.out.println("The result is : "+ countPrimeSetBits(left, right));
    }
}
