package Java_basic_Programs;
import java.util.Scanner;

public class MaxElementInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int maxEle = arr[0];
        for(int i=0 ; i<n ; i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
        }
        System.out.print("The max element in the array is : "+maxEle);
    }
}
