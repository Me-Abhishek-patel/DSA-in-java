package Java_basic_Programs;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        String set1 =
                " 1 3 5 7\n" +
                        " 9 11 13 15\n" +
                        "17 19 21 23\n" +
                        "25 27 29 31";

        String set2 =
                " 2 3 6 7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31";

        String set3 =
                " 4 5 6 7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";

        String set4 =
                " 8 9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        int day = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Is your birthday date is present in Set 1 : \n");
        System.out.println(set1);
        System.out.println("Enter 1 for YES and 0 for NO :\n");
        int answer = sc.nextInt();
        if (answer == 1) {
            day += 1;
        }

        System.out.println("Is your birthday date is present in Set 2 : \n");
        System.out.println(set2);
        System.out.println("Enter 1 for YES and 0 for NO :\n");
        answer = sc.nextInt();
        if(answer == 1){
            day += 2;
        }

        System.out.println("Is your birthday date is present in Set 3 : \n");
        System.out.println(set3);
        System.out.println("Enter 1 for YES and 0 for NO :\n");
        answer = sc.nextInt();
        if (answer == 1) {
            day += 4;
        }

        System.out.println("Is your birthday date is present in Set 4 : \n");
        System.out.println(set4);
        System.out.println("Enter 1 for YES and 0 for NO :\n");
        answer = sc.nextInt();
        if (answer == 1) {
            day += 8;
        }

        System.out.println("Is your birthday date is present in Set 5 : \n");
        System.out.println(set5);
        System.out.println("Enter 1 for YES and 0 for NO :\n");
        answer = sc.nextInt();
        if (answer == 1) {
            day += 16;
        }

        System.out.println("\nNow be ready to see the magic!!");
        System.out.println("Your Birthday Date is : "+day);
    }
}
