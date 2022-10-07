import java.util.Collection;
import java.util.Collections;

public class ArrayProblems {

    //to reverse the array
    void arrayReverse(int arr[]) {
        int low = 0, high = arr.length - 1, temp = 0;
        while (low < high) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;

        }
    }


    //to find maximum k consecutive elements
    //sliding window technique
    int maxKSum(int arr[], int k) {
        int max = Integer.MIN_VALUE;
        int win_sum = 0;
        for (int i = 0; i < k; i++) {
            win_sum += arr[i];
        }
        max = win_sum;

        for (int i = 0; i < arr.length - k; i++) {
            win_sum = win_sum - arr[i] + arr[i + k];

            if (win_sum > max)
                max = win_sum;
        }
        return max;
    }

    //to find maximum subarray sum
    //KADANE'S Algorithm

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


