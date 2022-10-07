
package striver;
import java.util.*;
public class first {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter array elements");
        for(int i=0;i<5;i++)
            arr[i]=s.nextInt();
        optimize(arr);
     

        
    }
    public static void optimize(int arr[])
    {
        int low=0,mid=0;
        int high=arr.length-1;
        while(mid<=high)
        {
            switch(arr[mid])
            {
                case 0:
                {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
                break;
                }
                case 1:
                {
                    mid++;
                    break;
                }
                case 2:
                {
                    int temp=arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=temp;
                    high--;
                    break;
                }
            }
            
        }
        System.out.println("Sorted elements are:");
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
