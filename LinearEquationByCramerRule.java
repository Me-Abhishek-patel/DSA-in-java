package Java_basic_Programs;
import java.util.Scanner;

public class LinearEquationByCramerRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a, b and e in equation : ax+by=e :-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int e =sc.nextInt();

        System.out.println("Enter the value of c, d and f in equation : cx+dy=f :-");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();

        int x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
        int y = (((a * f) - (e * c)) / ((a * d) - (b * c)));

        System.out.println("The value of x is :- "+x);
        System.out.println("The value of y is :- "+y);
    }
}
