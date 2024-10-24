public class fibonacci_2 {
    
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 1;

        int num3 = 0;
        int numberQty = 10;

        int iteration = 0;
        for (int i = 3; i <= numberQty; i++){
            
            //getting sum of num1 and num2 will have num3
            num3 = num1 + num2;

            //update the num1 and num2
            num1 = num2;
            num2 = num3;
            iteration =i;
        }
         
        System.out.println("The "+iteration+"th number: "+ num3);
    }
}
