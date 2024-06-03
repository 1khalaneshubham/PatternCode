import java.util.*;
public class SolidRhombus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter No: ");
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
        
            // spaces
            for(int j = 1; j <= (n-i); j++){
        
                System.out.print(" ");
        
            }

            // stars
            for(int j = 1; j<=n; j++){
        
                System.out.print("*");
        
            }
        
            System.out.println();
        
        }

        // int i = 1;
        // while (i <= n) {
        //     int j = 1;
        //     while (j <= n-i) {
        //         System.out.print(" ");
        //         j++;
        //     }
        //     while (j <= n) {
        //         System.out.print("*");
        //         j++;
        //     }
        //     i++;
        //     System.out.println();
        // }
    }
}
