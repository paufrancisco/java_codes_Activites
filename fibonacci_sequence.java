public class fibonacci_sequence {


    
    //0,1,1,2,3,5,8
    public static void main(String[] args) {
        
        int n = 10;  // Number of terms in the Fibonacci sequence
        int firstNum = 0;
        int secNum = 1;

        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 0; i < n; ++i) {
            // Print the current number
            System.out.print(firstNum);
            
            // Print a comma after each number except the last one
            if (i < n - 1) {
                System.out.print(", ");
            }

            // Calculate the next number in the sequence
            int nextNum = firstNum + secNum;
            firstNum = secNum;
            secNum = nextNum;
        }

        
    }
}
