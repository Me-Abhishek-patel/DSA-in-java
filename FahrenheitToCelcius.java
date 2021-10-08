package Java_basic_Programs;
import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in fahrenheit:-");
        double fah = sc.nextDouble();

        double cel = ((5.0 / 9) * (fah - 32));

        System.out.println("Temperature in degree celsius is : "+cel);
    }
}
