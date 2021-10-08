package Java_basic_Programs;
import java.util.Scanner;

public class SumOfFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of float numbers:");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" float numbers to add:");
        float[] a = new float[n];
        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextFloat();
        }
        float sum = 0;
        for(int i=0 ; i<a.length ; i++){
            sum += a[i];
        }

        System.out.println("The sum of given "+n+" float numbers is : "+sum);
    }
}
