package Java_basic_Programs;
import java.util.Scanner;
import java.math.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159; 

        System.out.println("Enter the value of radius of a circle :");
        double radius = sc.nextDouble();

        double area = (Math.pow(radius,2) * PI); //formula to calculate area of circle
        System.out.println("The area of a given circle is : "+area);
    }
}
