package Java_basic_Programs;
import java.util.Scanner;

public class Average_marks_of_Students_usingForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        System.out.println("Enter the numbers of every students in the class:");
        int[] students = new int[n];
        for(int i=0 ; i<n ; i++){
            students[i] = sc.nextInt();
        }
        int sum = 0;
        for(int student : students){
            sum += student;
        }

        System.out.println("The average of the marks is : "+(sum/n));
    }
}
