package Java_basic_Programs;
import java.util.Scanner;

public class SimpleSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        byte n = sc.nextByte();

        for(byte i=0 ; i<n ; i++){
            for(byte j=0 ; j<n ; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
