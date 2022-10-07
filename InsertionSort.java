package CP;
import java.util.Scanner;

public class InsertionSort {
    public static void insertion_sort(int[] input, int n){
        for(int i=1 ; i<n ; i++){
            int j = i - 1;
            int temp = input[i];
            while(j >= 0 && input[j] > temp){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] input = new int[n];
        for(int i=0 ; i<n ; i++){
            input[i] = sc.nextInt();
        }
        System.out.println("before sorting");
        for(int x1 : input){
            System.out.print(x1+" ");
        }
        System.out.println();
        System.out.println("after sorting");
        insertion_sort(input, n);
        for(int x2 : input){
            System.out.print(x2+" ");
        }
    }
}
