package Java_basic_Programs;
import java.util.Scanner;

public class User_Input_in_Java {
    public static void main(String[] args) {
        System.out.println("Taking Input from User:-");
        Scanner s = new Scanner(System.in);      // System.in is used to take input from keyboard.
        System.out.println("Enter your name:-");
        String name = s.nextLine();  // for single string use s.next()
        System.out.println("Enter your age:-");
        int age = s.nextInt();                            // for integer
        System.out.println(name+" your age is :- "+age);
    }
}
