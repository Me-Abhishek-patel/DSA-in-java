// Here we have given an array where one element has only one occurrence while the remaining elements have 2 occurrences
package BitManipulation;
import java.util.*;
import java.lang.*;

public class FIndELement_FirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements:");
        for(int i=0 ; i<n ; i++){
            array[i] = sc.nextInt();
        }

        int res = 0;
        for(int i=0 ; i<n ; i++){
            res ^= array[i];
        }

        System.out.println("Element with one occurrence is :"+res);
    }
}
