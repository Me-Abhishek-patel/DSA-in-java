package Java_basic_Programs;
import java.util.*;
import java.lang.*;

public class Some_important_points_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("After sorting:");
        Arrays.sort(array); // for sorting the array
        for(int x1 : array){
            System.out.print(x1+" ");
        }
        System.out.println("\nEnter key to search:");
        int key = sc.nextInt();
        System.out.println("The searched key is at position"+" "+Arrays.binarySearch(array, key)); // for searching the key element in the array by using binary search algo
    }
}
