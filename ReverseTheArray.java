package CP;

import  java.util.*;
import java.lang.*;

public class ReverseTheArray {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0 ; i<(n/2) ; i++){
            int temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        System.out.println("After reversing:");
        for(int x1 : a){
            System.out.print(x1+" ");
        }
    }
}
