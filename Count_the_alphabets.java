package Java_basic_Programs;
import java.lang.*;
import java.util.*;

public class Count_the_alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter characters:");
        char[] array = new char[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.next().charAt(0);
        }
        int[] count = new int[26];
        for(int i = 0; i < array.length ; i++){
            count[array[i]-'a']++;
        }
        for(int i = 0; i < count.length; i++){
            System.out.println(count[i]+"   "+(char)(i+'a'));
        }
    }
}