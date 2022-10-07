package Java_basic_Programs;
import java.util.*;
import java.lang.*;

public class Substring_of_a_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i=0 ; i<=s.length() ; i++){

            for(int j=i+1 ; j<=s.length() ; j++){

                System.out.println(s.substring(i, j));
            }
        }
    }
}
