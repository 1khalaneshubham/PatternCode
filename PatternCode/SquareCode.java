import java.util.Scanner;

public class SquareCode{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Line that you want: ");
        
        int line = sc.nextInt();
        
        // for(int i = 1; i <= line; i++){
        
        //     System.out.println("* * * * * ");
        
        // }

        int i = 1;

        while (i <= line) {
         
            System.out.println("* * * * *");
         
            i++;
       
        }

    }
}