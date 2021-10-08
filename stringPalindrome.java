package Java_basic_Programs;
import java.util.*;
import java.lang.*;

public class stringPalindrome {
    public static boolean Sp(String s){
        int beg = 0;
        int end = s.length()-1;
        while(beg < end){
            if(s.charAt(beg) != s.charAt(end)){
                return false;
            }
            beg++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word:");
        String s = sc.next();
        if(Sp(s)){
            System.out.println("String "+s+" is Palindrome.");
        }
        else{
            System.out.println("String "+s+" is not Palindrome.");
        }
    }
}
