public class InvertedHaifPyramid {
    public static void InvertedPyramid(int n){
        
        // methad - 1
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // methad - 2
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n-i) {
                System.out.print(" ");
                j++;
            }
            while (j <= n) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedPyramid(5);
    } 
}
