package RegExDemo;
import java.util.StringTokenizer;
import java.util.regex.*;

public class RegExDemo6 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Akash Deep Vishwakarma"); // here default argument is space(\\s)
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
