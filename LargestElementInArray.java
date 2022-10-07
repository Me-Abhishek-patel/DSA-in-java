package Java_basic_Programs;

import java.util.Scanner;

public class LargestElementInArray {
    public static int max(int[] input){
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<input.length ; i++){
            if(input[i] > max){
                max = input[i];
            }
        }
        return max;
    }
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int[] input = new int[size];
        System.out.println("Enter the elements:");
        for(int i=0 ; i<size ; i++){
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void printArray(int[] input){
        for(int a : input){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        printArray(arr);
        int largest = max(arr);
        System.out.println("The largest element in the array is : "+largest);
    }
}
