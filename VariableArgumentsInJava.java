package Java_basic_Programs;

public class VariableArgumentsInJava {
    static int sum(int... x){ // it will provide all the arguments as the elements of the array x.
        int sum = 0;
        for(int x1 : x){
            sum += x1;
        }
        return sum;
    }
    public static void main(String[] args) {
        /* Variable arguments means we can provide different arguments with in the same method */
        System.out.println("The sum of nothing is : "+sum());
        System.out.println("The sum of 2 and 5 is : "+sum(2, 5));
        System.out.println("The sum of 2, 3 and 4 is : "+sum(2, 3, 4));
        System.out.println("The sum of 1,2,3,4,5 and 6 is : "+sum(1, 2, 3, 4, 5, 6));
    }
}
