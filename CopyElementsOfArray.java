package Java_basic_Programs;
import java.util.Scanner;
import java.lang.System;

public class CopyElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // copying the elements one by one.

        int[] targetArr = new int[n];
//        for(int i=0 ; i<arr.length ; i++){
//            targetArr[i] = arr[i];
//        }
//        System.out.println("After copying the array:");
//        for(int i=0 ; i<targetArr.length ; i++){
//            System.out.print(targetArr[i]+" ");
//        }

        // By using arraycopy method

        System.arraycopy(arr,0, targetArr,0,arr.length);
        for(int i=0 ; i<targetArr.length ; i++){
            System.out.print(targetArr[i]+" ");
        }
    }
}
