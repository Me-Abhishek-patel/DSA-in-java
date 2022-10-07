//split() method in String class in regular expression java
package RegExDemo;
import java.util.regex.*;

public class RegExDemo5 {
    public static void main(String[] args) {
        String s = "Akash Deep Vishwakarma";
        String[] str = s.split("\\s");      // it takes regular expression as argument
        for(String s1 : str){
            System.out.println(s1);
        }
    }
}
