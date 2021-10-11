package CP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastInputOutputInJava {
    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int t = Integer.parseInt(st.nextToken());


        while(t-- > 0){

            StringTokenizer s = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(s.nextToken());
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());

            int ans = (2 * (180 + n) - (a + b));
            System.out.println(ans);
        }
    }
}
