package Java_basic_Programs;

public class MyName {
    public static void main(String[] args) {
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=4 ; j++){
                if(i==1 || i==3){
                    System.out.print("*");
                }
                else if(j==1 || j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=4 ; j++){
                if(j==1){
                    System.out.print("*");
                }
                else if(i+j == 5){
                    System.out.print("*");
                }
                else if(i==4 && j==3){
                    System.out.print("*");
                }
                else if(i==5 && j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=4 ; j++){
                if(i==1 || i==3){
                    System.out.print("*");
                }
                else if(j==1 || j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=4 ; j++){
                if(i==1 || i==3 || i==5){
                    System.out.print("*");
                }
                else if(i==2 && j==1){
                    System.out.print("*");
                }
                else if(i==4 && j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=4 ; j++){
                if(j==1 || j==4){
                    System.out.print("*");
                }
                else if(i==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
