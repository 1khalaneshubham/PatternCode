import java.util.Scanner;

public class inputReverseNo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a No: ");
        
        int Num = sc.nextInt();
        
        // methad - 1
        // for(int i = Num; i > 0; i = i / 10){
            
            //     int lastDigit = i % 10;
            
            // System.out.print(lastDigit);
            
            // }
            
            // methad - 2

            int i = Num;

            while (i > 0) {
            
                int lastDigit = i % 10;
            
                System.out.print(lastDigit);
            
                i = i / 10;
            
            }

            System.out.println();
        }
    }    

    