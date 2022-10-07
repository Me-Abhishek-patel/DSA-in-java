package CP;
import java.util.Scanner;

public class LinearSearch {
    public static int Ls(int[] input, int key){
       int pos = 0;
       for(int i=0 ; i<input.length ; i++){
           if(key == input[i]){
               System.out.println("the key is found at index : "+i);
           }
       }
       return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements nin the array:");
        int n = sc.nextInt();
        int[] input = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0 ; i<n ; i++){
            input[i] = sc.nextInt();
        }
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        int found = Ls(input, key);
    }
}
