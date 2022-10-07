package CP;
import java.util.Scanner;

//Code chef april cook off first question
public class passing_marks_codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int A_min = sc.nextInt();
            int B_min = sc.nextInt();
            int C_min = sc.nextInt();
            int T_min = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if((a>=A_min) && (b>=B_min) && (c>=C_min)){
                if((a+b+c) >= T_min){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                System.out.println("No");
            }
        }
    }
}
