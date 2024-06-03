public class CharacterNo {
    public static void main(String[] args) {
    
        int n = 4;
        char ch = 'A';

        // methad - 1
        
        // for(int i = 1 ; i <= n ; i++){
            
        //     for(int j = 1; j <= i; j++){
        
        //         System.out.print(" "+ch );
        //         ch++;
        
        //     }
        
        //    System.out.println();
        
        // }
        
        // methad - 2
    
        int i = 1;
    
        while (i <= n) {
        
            int j = 1;
        
            while (j <= i) {
                
                System.out.print(" "+ch);
                ch++;
                
                j++;
            }
    
            i++;
            System.out.println();
        }
    }
}
