public class PrefixSum {
    public static int[] prefixSum(int arr[]){
        int prefix_sum[]= new int[arr.length];
        prefix_sum[0]= arr[0];
        for (int i=1; i<arr.length; i++){
            prefix_sum[i]= prefix_sum[i-1]+arr[i];
        }
        return prefix_sum;

//
//        BitWise bit = new BitWise();
//        System.out.println(bit.divideBy2(8));
//        System.out.println(bit.multiplyBy2(8));
//        System.out.println(bit.log2(8));
//
//        BitProblems bit = new BitProblems();
//        System.out.println(bit.countSetBits(39));

//        if (bit.isPow2(128))
//            System.out.println("yes");
//        else System.out.println("no");
//
//        ArrayProblems ap = new ArrayProblems();
//        int arr[] = {0, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 5, 15, 13};
//        System.out.println(bit.findOddOccuring(arr));

//        System.out.println(bit.missingNum(arr));
//        ap.arrayReverse(arr);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//                PrefixSum ps= new PrefixSum();
//
//                int arr[] = {2,8,3,9,6,5,4};
//                int brr[] = ps.prefixSum(arr);
//                for (int i=0; i<arr.length; i++){
//                    System.out.print(brr[i]+" ");
//                }

//            }
//        }


    }
}
