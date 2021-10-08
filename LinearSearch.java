package Java_basic_Programs;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr =  new int[n];
        System.out.println("Enter elements of the array:");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key to search:");
        int key = sc.nextInt();

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == key){
                System.out.print("The key "+key+" is found at index : "+i);
            }
        }
    }
}
