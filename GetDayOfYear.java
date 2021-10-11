package CP;

import java.time.LocalDate;
import java.util.Scanner;

public class GetDayOfYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] c = s.split("-");
        int year = Integer.parseInt(c[0]);
        int month = Integer.parseInt(c[1]);
        int date = Integer.parseInt(c[2]);

        LocalDate l = LocalDate.of(year, month, date);
        System.out.println(l.getDayOfYear());
    }
}
