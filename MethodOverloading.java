package Java_basic_Programs;
import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first value:");
        int n1 = sc.nextInt();
        System.out.println("Enter your second value:");
        int n2 = sc.nextInt();

        System.out.println("Enter your first floating point number:");
        double n3 = sc.nextDouble();
        System.out.println("Enter your second floating point number:");
        double n4 = sc.nextDouble();

        System.out.println("The max of "+n1+" and "+n2+" is :"+max(n1, n2));
        System.out.println("The max of "+n3+" and "+n4+" is :"+max(n3, n4));
    }

    // Here we are using method overloading. Same Method name but different formal parameters.
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

    public static double max(double i, double j){
        double result;
        if(i > j){
            result = i;
        }
        else{
            result = j;
        }
        return result;
    }
}

