package run_employee;

public class part_time_employee extends employee {
    
    private double wage;
    
    // Method to calculate wage based on rate per hour and hours worked
    public void setWage(double ratePerHour, int hoursWorked) {
        this.wage = ratePerHour * hoursWorked;
    }
    
    // Getter for the wage
    public double getWage() {
        return wage;
    }
}
