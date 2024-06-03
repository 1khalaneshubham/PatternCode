public class StarPattern {
    public static void main(String[] args) {
        
        //  methad - 1
        // for(int i = 1; i <= 5; i++){
            
        //     for(int j = 1; j <= i; j++){
            
        //         System.out.print(" * ");
            
        //     }
            
        //     System.out.println();
        // }

        // methad - 2
        
        int i = 1;
        
        while (i <= 5) {
            
            int j = 1;
            while (j <= i ) {
        
                System.out.print(" * ");
        
                j++;
            }
            i++;
            
            System.out.println();
        }
    }
}
