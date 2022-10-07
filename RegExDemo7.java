package RegExDemo;

import java.util.StringTokenizer;

public class RegExDemo7 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Akash-Deep-Vishwakarma","-"); // here giving user argument also known as delim.
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
