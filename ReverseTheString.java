package Java_basic_Programs;
import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string:-");
        String s = sc.nextLine();     // Taking String input in String class

//        StringBuffer s1 = new StringBuffer(s);// Then assigning this string to StringBuffer class for using revers() function
//        System.out.println(s1.reverse());

        String r = reverse(s);

    }

    public static String reverse(String s){
        char[] letters =  new char[s.length()];

        for(int i=s.length()-1 ; i>=0 ; i--){
            System.out.print(s.charAt(i));
        }
        return s;
    }
}
