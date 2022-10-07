// some important methods in Regular expressions

package RegExDemo;
import java.util.Scanner;
import java.util.regex.*;

public class RegExDemo {
    public static void main(String[] args) {
        int count = 0;
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("ababbaba");
        while(m.find()){
            count++;
            System.out.println(m.start()+"....."+m.end()+"....."+m.group());
        }
        System.out.println("The number of occurrence of ab is : "+count);
    }
}
