public class Rectangle {
    public static void HollowRectangle(int n,int m){ 
        // n-> No.Row,
        // m-> No.Col

        // methad - 1
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= m; j++){
        //         if(i == 1 || i == n || j == 1 || j == m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // methad - 2
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= m) {
                if(i == 1 || i == n || j == 1 || j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HollowRectangle(5, 6);
    }
}
