package Java_basic_Programs;
import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:-");
        byte n = sc.nextByte();

        // for printing upper part of the pattern
        for(byte i=1 ; i<=n ; i++){
            for(byte j=1 ; j<=i ; j++){     // For printing left *
                System.out.print("*");
            }
            byte space = (byte)((2*n)-(2*i));
            for(byte j=1 ; j<=space ; j++){     // for printing space
                System.out.print(" ");
            }
            for(byte j=1 ; j<=i ; j++){        // for printing right *
                System.out.print("*");
            }
            System.out.println();
        }

        // for printing lower part of the pattern
        for(byte i=n ; i>=1 ; i--){
            for(byte j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            byte space = (byte)((2*n)-(2*i));
            for(byte j=1 ; j<=space ; j++){
                System.out.print(" ");
            }
            for(byte j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
