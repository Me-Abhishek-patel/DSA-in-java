package Java_basic_Programs;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string :");
        String str = sc.nextLine();

        int low = 0;
        int high = str.length() - 1;
        boolean isPalindrome = true;

        while(low < high){
            if(str.charAt(low) != str.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if(isPalindrome){
            System.out.println("The given string "+str+" is Palindrome.");
        }
        else{
            System.out.println("The given string "+str+" is not Palindrome. ");
        }
    }
}
