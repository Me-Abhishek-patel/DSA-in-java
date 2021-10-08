package Java_basic_Programs;
import java.util.Scanner;

public class methodOverloadingInJava {

    // same method name but different argument types

    static void foo(){
        System.out.println("Good morning!");
    }
    static void foo(int a){
        System.out.println("Good morning brother!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w=1;
        foo();
        foo(1); // arguments are actual
    }
}
