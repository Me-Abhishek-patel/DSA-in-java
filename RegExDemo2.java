// Some pre-defined character classes in regular expression java

package RegExDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s");  // for space character
//        Pattern p = Pattern.compile("\\S");     // any character except space
//        Pattern p = Pattern.compile("\\d");     // any digit from 0 to 9
//        Pattern p = Pattern.compile("\\D");     //any character except digit
//        Pattern p = Pattern.compile("\\w"); // any alpha-numeric character
//        Pattern p = Pattern.compile("\\W");     // special character
//        Pattern p = Pattern.compile(".");     // any symbol including special symbol
        Matcher m = p.matcher("a7b k@9");
        while(m.find()){
            System.out.println(m.start()+"....."+m.group());
        }
    }
}
