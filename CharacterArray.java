package Java_basic_Programs;
import java.util.Scanner;

public class CharacterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        char[] character = new char[n];
        System.out.println("Enter the elements of the char array:");
        for(int i = 0 ; i < n ; i++){
            character[i] = sc.next().charAt(0);
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(character[i]);
        }

//        for(char x1 : character){
//            System.out.print(x1);        // Enhanced for loop
//        }
    }
}
