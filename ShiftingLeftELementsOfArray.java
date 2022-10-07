package Java_basic_Programs;
import java.util.Scanner;

public class ShiftingLeftELementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your elements:");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before shifting the array is:");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("After shifting left:");
        int temp = arr[0];
        for(int i=1 ; i<n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
