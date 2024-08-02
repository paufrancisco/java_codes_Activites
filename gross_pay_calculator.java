package grosspaycalculator;

import java.util.Scanner;

 
// This program calculates the gross pay of an employee based on their type and inputs.
 
public class GrossPayCalculator {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Employee's name
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        // Employee type
        System.out.print("Press F for Full Time or P for Part Time: ");
        String employeeType = sc.nextLine();

        // Part-time employee calculations
        if (employeeType.equalsIgnoreCase("P")) {
            System.out.println("--- Part Time Employee ---");
            System.out.print("Enter rate per hour: ");
            double ratePerHour = sc.nextDouble();
            System.out.print("Enter number of hours worked: ");
            double hoursWorked = sc.nextDouble();
            System.out.print("Enter number of overtime hours: ");
            double overtimeHours = sc.nextDouble();
            
            // Calculate basic pay and overtime pay
            double basicPay = ratePerHour * hoursWorked;
            double overtimePay = ratePerHour * overtimeHours * 1.25;
            double grossPay = basicPay + overtimePay;
            
            // Display results
            System.out.println("___________________________");
            System.out.printf("Employee Name:      %s%n", name);
            System.out.printf("Basic Pay:          %.2f%n", basicPay);
            System.out.printf("Overtime Pay:       %.2f%n", overtimePay);
            System.out.println("___________________________");
            System.out.printf("Gross Pay:          %.2f%n", grossPay);

        // Handle full-time employee calculations
        } else if (employeeType.equalsIgnoreCase("F")) {
            System.out.println("--- Full Time Employee ---");
            System.out.print("Enter Basic Pay: ");
            double basicPay = sc.nextDouble();
            
            // Display results
            System.out.println("___________________________");
            System.out.printf("Employee Name:      %s%n", name);
            System.out.printf("Basic Pay:          %.2f%n", basicPay);
            System.out.println("___________________________");
            System.out.printf("Gross Pay:          %.2f%n", basicPay);

        // Handle invalid input
        } else {
            System.out.println("Invalid input. Please enter 'F' for Full Time or 'P' for Part Time.");
        }

         
        sc.close();
    }
}
