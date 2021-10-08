// Character classes in Regular Expressions.

package RegExDemo;
import javax.swing.plaf.metal.MetalTabbedPaneUI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedExDemo1 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("[abc]");   // Either a or b or c
//        Pattern p = Pattern.compile("[^abc]");  // except a , b and c
//        Pattern p = Pattern.compile("[a-z]");     // any lower case alphabet
//        Pattern p = Pattern.compile("[A-Z]");     // any upper case alphabet
//        Pattern p = Pattern.compile("[a-z A-Z]");     // any alphabet
//        Pattern p = Pattern.compile("[0-9]");     // any digit from 0 to 9
//        Pattern p = Pattern.compile("[a-z A-Z 0-9]");     // any alpha-numeric symbol
        Pattern p = Pattern.compile("[^a-z A-Z 0-9]");  // special symbols
        Matcher m = p.matcher("a7b@z#9");
        while(m.find()){
            System.out.println(m.start()+"....."+m.group());
        }
    }
}
