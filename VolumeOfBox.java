package Java_basic_Programs;
import java.util.*;

public class VolumeOfBox{
    public static void main(String[] args){
        class box{
            int height;
            int width;
            int depth;
        }

        box MyBox = new box();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimension of height :");
        MyBox.height = sc.nextInt();

        System.out.println("Enter the dimension of width :");
        MyBox.width = sc.nextInt();

        System.out.println("Enter the dimension of depth :");
        MyBox.depth = sc.nextInt();

        int volume = MyBox.height * MyBox.width * MyBox.depth;

        System.out.println("The volume of the given box is : " +volume);
    }
}