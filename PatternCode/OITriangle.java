import java.util.Scanner;

public class OITriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();
        
        // methad - 1
        // for(int i = 1; i <= N; i++){
        //     for(int j = 1; j <= i; j++){
        //         if((i+j) % 2 == 0 ){
        //             System.out.print(" "+1);
        //         }else{
        //             System.out.print(" "+0);
        //         }
        //     }
        //     System.out.println();
        // }

        // methad - 2
        int i = 1;
        while (i <= N) {
            int j = 1;
            while (j <= i) {
                if(i % 2 == 0 ){
                    System.out.print(" "+0);
                }else{
                    System.out.print(" "+1);
                }
                j++;
            }
            i++;  
            System.out.println();       
        }
    }
}
