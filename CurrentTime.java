package Java_basic_Programs;

public class CurrentTime {
    public static void main(String[] args) {
        long totalMilliSeconds = System.currentTimeMillis();

        long totalSecond  = totalMilliSeconds / 1000;
        long currentSecond = totalSecond % 60;

        long totalMinutes = currentSecond / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = currentMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.println("Current time is "+currentHours+":"+currentMinutes+":"+currentSecond+"GMT");
    }
}
