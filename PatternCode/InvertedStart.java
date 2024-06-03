public class InvertedStart {
   public static void main(String[] args) {
    
    // methad - 1
    
    // for(int i = 1 ; i <= 5 ; i++){
        
    //     for(int j = 1; j <= (5-i+1); j++){
    
    //         System.out.print(" * ");
    
    //     }
    
    //    System.out.println();
    
    // }
    
    // methad - 2

    int i = 1;

    while (i <= 5 ) {
    
        int j = 1;
    
        while (j <= (5-i+1)) {
            
            System.out.print(" * ");
            
            j++;
         }

         i++;
         System.out.println();
        }
    }

}
