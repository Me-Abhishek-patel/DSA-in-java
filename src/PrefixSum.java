public class PrefixSum {
    public static int[] prefixSum(int arr[]){
        int prefix_sum[]= new int[arr.length];
        prefix_sum[0]= arr[0];
        for (int i=1; i<arr.length; i++){
            prefix_sum[i]= prefix_sum[i-1]+arr[i];
        }
        return prefix_sum;
    }
}
