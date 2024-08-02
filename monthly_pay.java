package monthlypay;

/**
 * This program calculates the monthly pay of an employee after deductions.
 */
public class MonthlyPay {

    public static void main(String[] args) {
        // Employee details
        String employeeName = "Jess Diaz";
        double grossPay = 25000.0;
        
        // Deduction rates and amounts
        double withholdingTax = grossPay * 0.15;
        double sssContribution = grossPay * 0.0363;
        double medicare = grossPay * 0.0125;
        double pagibig = 100.0;
        
        // Calculate net pay
        double netPay = grossPay - (withholdingTax + sssContribution + medicare + pagibig);
        
        // Display results
        System.out.printf("Employee Name:                 %s%n", employeeName);
        System.out.printf("Gross Pay:                      %.2f%n", grossPay);
        System.out.println("____________________________________________");
        System.out.printf("Deductions                      Amount%n");
        System.out.printf("Withholding Tax:                %.2f%n", withholdingTax);
        System.out.printf("SSS Contribution:               %.2f%n", sssContribution);
        System.out.printf("Medicare:                       %.2f%n", medicare);
        System.out.printf("Pagibig Contribution:           %.2f%n", pagibig);
        System.out.println("____________________________________________");
        System.out.printf("Net Pay:                        %.2f%n", netPay);
    }
}