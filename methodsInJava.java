package Java_basic_Programs;
import java.util.Scanner;

public class methodsInJava {
    static void tellJoke(){
        System.out.println("I invented a new word : Plagiarism");
    }
    public static int sum(int i, int j){ // method is always placed inside any class in java.
        return i+j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter your second number:");
        int n2 = sc.nextInt();
        System.out.println("The sum of given numbers is : "+sum(n1, n2));
        tellJoke();
    }
}
