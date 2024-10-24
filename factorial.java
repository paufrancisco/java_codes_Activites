public class factorial {

    public static void main(String[] args) {
        
        int num1 = 5;
        int factorial = 1;
        for (int i = num1; i > 0; --i) {
            
            //container
            //update mo si num1
            System.out.println(i); 
            factorial *=i;

        }


        System.out.println("The factorial of "+num1+" is "+factorial);
    }
    
}
