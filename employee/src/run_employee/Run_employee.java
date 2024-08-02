package run_employee;

import java.util.Scanner;

public class Run_employee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Create employee objects
            employee emp = new employee();
            full_time_employee fte = new full_time_employee();
            part_time_employee pte = new part_time_employee();
            
            // Get employee details
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            emp.setName(name);
            
            System.out.print("Press F for full time or P for part time: ");
            String press = sc.nextLine().trim().toUpperCase();
            
            if (press.equals("F")) {
                System.out.print("Please type your monthly salary: ");
                double salary = sc.nextDouble();
                fte.setSalary(salary);
                
                System.out.println("Name: " + emp.getName());
                System.out.printf("Monthly Salary: %.2f\n", fte.getSalary());
            } else if (press.equals("P")) {
                System.out.print("Please type your rate per hour and hours worked separated by space: ");
                double ratePerHour = sc.nextDouble();
                int hoursWorked = sc.nextInt();
                pte.setWage(ratePerHour, hoursWorked);
                
                System.out.println("Name: " + emp.getName());
                System.out.printf("Total Wage: %.2f\n", pte.getWage());
            } else {
                System.out.println("Invalid input. Please press F or P.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close(); // Close the scanner
        }
    }
}
