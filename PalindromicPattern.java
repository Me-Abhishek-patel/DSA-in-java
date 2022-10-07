package Java_basic_Programs;
import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:-");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            int j;
            for(j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            int k = i;
            for(; j<=n ; j++){
                System.out.print(k--);
            }
            k=2;
            for(; j<=(n+i-1) ; j++){
                System.out.print(k++);
            }
            System.out.println();
        }
    }
}
