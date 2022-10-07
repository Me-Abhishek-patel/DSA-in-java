package Java_basic_Programs;
import java.util.Scanner;

public class RightShiftedStairPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n:-");
        byte n = sc.nextByte();

        for(byte i=1;i<=n;i++){
            for(byte j=1;j<=n;j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
