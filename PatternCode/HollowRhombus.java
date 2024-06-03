import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
        
            for(int j = 1; j <= (n-i); j++){
        
                System.out.print(" ");
        
            }
        
            // HollowR hombus
        
            for(int j = 1; j <= n; j++){
        
                if(i == 1 || i == n || j == 1 ||  j == n){
        
                    System.out.print("*");
        
                }else{
        
                    System.out.print(" ");
    
                }
        
            }
            
            System.out.println();
        }

        // int i = 1;
        // while (i <= n) {
        //     int j = 1;
        //     while (j <= (n-i)) {
        //         while (j<=n) {
        //             if (i == 1 || i == n || j == 1 || j == n) {
        //                 System.out.print("*");
        //             }else{
        //                 System.out.print(" ");
        //             }
        //             j++;
        //         }
        //         j++;
        //     }
        // }
        // i++;
        // System.out.println();
    }
}
