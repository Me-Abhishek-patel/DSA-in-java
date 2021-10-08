package Java_basic_Programs;
import java.util.Scanner;

public class StringInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Name:\n");
        String name1 = sc.nextLine();   // for one word string input

        System.out.print("Enter Your Second Name:\n");
        String name2 = sc.nextLine();

        System.out.println("Enter Your College Name:");
        String college_name = sc.nextLine();    // for multiple line input

        System.out.println(name1+" "+name2);
        System.out.println(college_name);
    }
}
