package Java_basic_Programs;
import java.util.Scanner;

public class SingleDimensionalArrayInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Array declaration and initialization

        System.out.println("Enter the elements of the array:"); // array assignment
        for(int i = 0 ; i < n ; i++){
            arr[i]  = sc.nextInt();
        }

        System.out.println("The elements that you entered are as follows:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
