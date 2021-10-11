package CP;
import java.util.Scanner;

public class BinarySearch {
    public static int binary(int[] input, int ele){
        int start = 0;
        int end = input.length - 1;
        while(start < end){
            int mid = (start + (end - start) / 2);
            if(ele == input[mid]){
                return mid;
            }
            else if(input[mid] > ele){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] input = new int[n];
        for(int i=0 ; i<n ; i++){
            input[i] = sc.nextInt();
        }
        System.out.println("Enter the key to search:");
        int ele = sc.nextInt();
        int index = binary(input, ele);
        if(index == -1){
            System.out.println("The element is not found in the array.");
        }
        else{
            System.out.println("The element is found in the array at position : "+index+1);
        }
    }
}
