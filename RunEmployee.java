
package runemployee;
import java.util.Scanner;

public class RunEmployee {

    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);
        
        Employee emp = new Employee();
        FullTimeEmployee fte = new FullTimeEmployee();
        PartTimeEmployee pte = new PartTimeEmployee();
                
        
       
  
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        emp.setname(name);
        System.out.print("Press F for full time or P for part time: ");
        String press = sc.nextLine();
        
        
        
        if(press.equals("F")){
            System.out.print("Please type your monthly salary: ");
            fte.setsalary(sc.nextDouble());
            
            System.out.println("Name: "+emp.getname());
            System.out.printf("Wage: %.2f\n",fte.getsalary());
        }
        else if(press.equals("P")){
            System.out.print("Please type your rate per hour and hours work separated by space: ");
            double salary = 1.00;
            pte.setwage(salary,sc.nextDouble(),sc.nextInt());
            System.out.println("Name: "+emp.getname());
            System.out.printf("Wage: %.2f\n",pte.getwage());
        }
    }      
}
