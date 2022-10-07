package CP;
import java.util.Scanner;

public class BubbleSort {
    public static void bubble_sort(int[] input, int n){
        for(int i=0 ; i<n-1 ; i++){ //running loop for 0 to n-2
            int flag = 0;   // for checking swapping is happens or not
            for(int j=0 ; j<(n-i-1) ; j++){
                if(input[j] > input[j+1]){
                    int temp = input[j];    //taking temp variable for swapping purpose
                    input[j] = input[j+1];
                    input[j+1] = temp;
                    flag = 1;  // after swapping we set flag as 1
                }
            }
            if (flag == 0) // if swapping is not happened then break the loop
                break;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] input = new int[n];   //creating an array
        for(int i=0 ; i<n ; i++){
            input[i] = sc.nextInt();    //storing values in the array
        }
        System.out.println("Before sorting:");
        for(int x1 : input){
            System.out.print(x1+" ");
        }
        System.out.println();
        bubble_sort(input, n);
        System.out.println("after sorting");
        for(int x2 : input){
            System.out.print(x2+" ");
        }
    }
}
