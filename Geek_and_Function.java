package BitManipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Geek_and_Function {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while(t-- > 0){
//
//           int n = sc.nextInt();
//           int k = sc.nextInt();
//
//            while(k != 0){
//
//                int funcN = n ^ (n % 10);
//                n = funcN;
//                k--;
//            }
//
//            System.out.println(n);
//        }

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int t = Integer.parseInt(s);

        while(t-- > 0){
           String[] str = new String[2];
           str = bf.readLine().split(" ");

           int n = Integer.parseInt(str[0]);
           int k = Integer.parseInt(str[1]);

           while(k != 0){
               int funcN = n ^ (n % 10);
               n = funcN;
               k--;
           }
            System.out.println(n);
        }
    }
}
