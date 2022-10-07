package CP;

import java.util.Scanner;

public class Check_ifNumber_is_power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        boolean res = true;

        if(n == 0){

            res = false;
        }
        else{

            double res1 = Math.floor(Math.log(n) / Math.log(2));
            double res2 = Math.ceil((Math.log(n) / Math.log(2)));

            res = res1 == res2;
        }

        if(res){

            System.out.println(n+" is power of 2.");
        }
        else{

            System.out.println(n+" is not power of 2.");
        }
    }
}
