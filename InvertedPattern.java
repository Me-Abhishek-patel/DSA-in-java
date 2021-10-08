package Java_basic_Programs;
import java.util.Scanner;

public class InvertedPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:-");
        byte n = sc.nextByte();

        for(byte i=5 ; i>=1 ; i--){
            for(byte j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
