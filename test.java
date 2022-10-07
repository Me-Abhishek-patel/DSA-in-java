package Java_basic_Programs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

public class test {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t-- > 0){
            String[] array = new String[3];
            array = bf.readLine().split(" ");
            int n = Integer.parseInt(array[0]);
            int x = Integer.parseInt(array[1]);
            int k = Integer.parseInt(array[2]);
            boolean isGoal = false;

            for(int i = 0 ; i < (n + 2) ; i = (i + k)){
                if(i == x){
                    isGoal = true;
                }
            }

            if(! isGoal){
                for(int i = (n + 1) ; i >= 0 ; i = (i - k)){
                    if(i == x){
                        isGoal = true;
                    }
                }
            }

            if(isGoal){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}