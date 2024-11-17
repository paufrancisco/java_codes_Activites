
import java.util.InputMismatchException;
import java.util.Scanner;
public class exception {
    
    public static void main(String[] args) {
        

       


        boolean notInteger = false;

        do { 
            
            Scanner sc = new Scanner(System.in); 

            System.out.print("Enter an Integer: ");
          
            try{
                int input = sc.nextInt();
                int square = input * input;
                System.out.println("square: "+ square);
                break;
            }catch(InputMismatchException e){ 
                notInteger = true;
            }


        } while (notInteger);








    }

}
