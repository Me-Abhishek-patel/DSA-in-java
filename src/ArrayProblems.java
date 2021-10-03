import java.util.Collection;
import java.util.Collections;

public class ArrayProblems {

    //to reverse the array
    void arrayReverse(int arr[]) {
        int low = 0, high = arr.length - 1, temp = 0;
        while (low < high) {
            temp = arr[low];
            arr[low] = arr[high]; //swappig the elements
            arr[high] = temp;
            low++;
            high--;

        }
    }


    //to find maximum k consecutive elements
    //sliding window technique
    int maxKSum(int arr[],int k){
        int max=Integer.MIN_VALUE;
        int max_score=0;
        for (int i=0; i<k; i++){
            max_score+=arr[i];
        }
        max=max_score;

        for (int i=0; i<arr.length-k; i++){
            win_sum=win_sum-arr[i]+arr[i+k];

            if (max_score>max)
                max=max_score;
        }
        return max;
    }

    //to find maximum subarray sum of array we use KADANE'S algorithm


}


