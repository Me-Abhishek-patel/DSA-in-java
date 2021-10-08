package Java_basic_Programs;
import java.util.Scanner;

public class CalculateCBSEmarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of Hindi:-\t");
        float hindi = s.nextFloat();
        System.out.println("Enter the marks of English:-\t");
        float english = s.nextFloat();
        System.out.println("Enter the marks of Maths:-\t");
        float maths = s.nextFloat();
        System.out.println("Enter the marks of Physics:-\t");
        float physics = s.nextFloat();
        System.out.println("Enter the marks of Chemistry:-\t");
        float chem = s.nextFloat();
        float per = (float)((hindi + english + maths + physics + chem)*100)/500;
        System.out.println("The percentage of the student is :- "+per+"%");
    }
}
