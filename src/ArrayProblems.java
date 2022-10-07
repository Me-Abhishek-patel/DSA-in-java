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
            low++;      //after swap increment the value of low
            high--;     //similarly decrement the value of high 

        }
    }


    //to find maximum k consecutive elements
    //sliding window technique

    int maxKSum(int arr[],int k){
        int max=Integer.MIN_VALUE;
        int max_score=0;//set a variable max_score to 0
        for (int i=0; i<k; i++){
            max_score+=arr[i];
        }


        for (int i = 0; i < arr.length - k; i++) {
            win_sum = win_sum - arr[i] + arr[i + k];


            if (max_score>max)//comparing max with max_score
                max=max_score;
        }
        return max;
    }

    //to find maximum subarray sum of array we use KADANE'S algorithm

    int kadane(int a[]) {
        int maxEnd = a[0];
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            maxEnd = Math.max(maxEnd, maxEnd + a[i]);
            res = Math.max(res, maxEnd);
        }
        return res;
    }

    //to make prefix sum array
    int[] prefixSum(int a[]) {
        int[] ps = new int[a.length];
        ps[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            ps[i] = a[i] + ps[i - 1];
        }
        return ps;
    }

}


