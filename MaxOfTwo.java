package Java_basic_Programs;
import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first value:");
        int n1 = sc.nextInt();
        System.out.println("Enter your second value:");
        int n2 = sc.nextInt();

        System.out.println("The max of "+n1+" and "+n2+" is :"+max(n1, n2));
    }
    public static int max(int i, int j){
        int result;
        if(i > j){
            result = i;
        }
        else{
            result = j;
        }
        return result;
    }
}

