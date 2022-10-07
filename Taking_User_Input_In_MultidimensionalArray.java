package Java_basic_Programs;
import java.util.Scanner;

public class Taking_User_Input_In_MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 12 names: ");
        String name[][] = new String[3][4];
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<4 ;j++){
                name[i][j] = sc.nextLine();
            }
        }
        System.out.println("The entered names are -");
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<4 ;j++){
                System.out.println("Name at position - name["+i+"]"+"["+j+"]"+" is : "+name[i][j]);
            }
        }
    }
}
