package Java_basic_Programs;
import java.util.Scanner;

public class Check_IsArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for(int i=0 ; i<n-1 ; i++){
            if(a[i] > a[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }
    }
}
