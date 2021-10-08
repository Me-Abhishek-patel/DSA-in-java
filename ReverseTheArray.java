package Java_basic_Programs;
import java.util.Scanner;
import java.math.*;

public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array before shifting:");
        for(int x:a){
            System.out.print(x+" ");
        }
        int low = 0;
        int high = (n-1);
        int halfLen = Math.floorDiv(n, 2);
        while(low < halfLen){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        System.out.println("\nArray after reversing:");
        for(int i=0 ; i<n ; i++){
            System.out.print(a[i]+" ");
        }
    }
}
