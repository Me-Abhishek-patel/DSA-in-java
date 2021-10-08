package Java_basic_Programs;
import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any decimal value :");
        int dec = sc.nextInt();
        int temp = dec;
        String hexaDec = "";

        while(dec != 0){
            int hexaval = dec % 16;
            char hexaDigit = (0 <= hexaval && hexaval <= 9) ? (char) (hexaval+'0') : (char) (hexaval - 10 + 'A');
            hexaDec = hexaDigit + hexaDec;
            dec = dec / 16;
        }
        System.out.println("The Hexadecimal form of given decimal number "+temp+" is "+hexaDec);
    }
}
