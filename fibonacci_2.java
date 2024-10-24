public class fibonacci_2 {
    
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 1;

        int numQty = 11;  
        int num3 = 0;
        

        for (int i = 3; i <= numQty; i++) {

            num3 = num1 + num2; // sum = 1 , num1 = 0 num2 = 1
            
            num1 = num2; // num1 = 1
            num2 = num3; // num2 = 1
 
            
        }

        System.out.println("The "+numQty+"th number is "+num3);
        
    }
}
