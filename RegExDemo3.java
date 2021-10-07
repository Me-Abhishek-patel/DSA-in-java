// Quantifiers in Regular Expression in java
package RegExDemo;
import javax.imageio.ImageTranscoder;
import java.util.regex.*;

public class RegExDemo3 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("a"); // exactly one a
//        Pattern p = Pattern.compile("a+");    // atleast one a
//        Pattern p = Pattern.compile("a*");    // any number of a
        Pattern p = Pattern.compile("a?");  // atmost one a
        Matcher  m = p.matcher("abaabaab");
        while(m.find()){
            System.out.println(m.start()+"....."+m.group());
        }
    }
}
