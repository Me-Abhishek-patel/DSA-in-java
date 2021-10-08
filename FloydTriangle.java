package Java_basic_Programs;
import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:-");
        byte n = sc.nextByte();

        byte count = 1;
        for(byte i=1 ; i<=n ;i++){
            for(byte j=1 ; j<=i ; j++){
                System.out.print(" "+count);
                count++;
            }
            System.out.println();
        }
    }
}
