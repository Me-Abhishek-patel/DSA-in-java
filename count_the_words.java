// We are counting the number of words in a sentence.
package Java_basic_Programs;
import java.util.*;
import java.lang.*;

public class count_the_words {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence:");
        String s = sc.nextLine();
        int count = 0;
        for(int i=0 ;i<s.length() ; i++){
            if(s.charAt(i) == 32){  // if the ith char is space then increase the value of count variable by 1.
                count++;
            }
        }
        System.out.println(count+1); // printing value of count+1 because between 2 words there is only one space.
        // so, if number of words = n then number of spaces will be n-1.
    }
}
