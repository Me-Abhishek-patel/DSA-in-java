package Java_basic_Programs;
import java.util.Scanner;

public class HallowSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n:");
        byte n = sc.nextByte();

        for(byte i=0;i<n;i++){
            for(byte j=0;j<n;j++){
                 if(i==0 || i==(n-1)){
                     System.out.print("*");
                 }
                 else if(j==0 || j==(n-1)){
                     System.out.print("*");
                 }
                 else{
                     System.out.print(" ");
                 }
            }
            System.out.println();
        }
    }
}
