//  split() method in Pattern class in regular expression in java.
package RegExDemo;
import java.util.regex.*;

public class RegExDemo4 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("\\s");
//        String[] s = p.split("Akash Deep Vishwakarma");   // it takes target string as argument

        Pattern p = Pattern.compile("\\.");     //  \\. and [.] both are same.
        String[] s = p.split("www.enggfact.com");

        for(String s1 : s){
            System.out.println(s1);
        }
    }
}
