package Java_basic_Programs;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number :-");
        int n = s.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n+" X "+i+" = "+(n * i));
        }
    }
}
