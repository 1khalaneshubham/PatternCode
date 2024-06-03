public class ReverseNo {
    public static void main(String[] args) {
        int n = 1122002;


        // methad - 1
        for(int i = n; i > 0;  i = i/10){
            int lastDigit = i % 10;
            System.out.print(lastDigit);
        }
        System.out.println();

        // methad - 2
        // while (n > 0) {
        //     int lastDigit = n % 10; // last digit Logic
        //     System.out.print(lastDigit);
        //     n = n/10;   // update
        // }

        // System.out.println();
    }
}
