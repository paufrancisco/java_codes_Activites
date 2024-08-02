
package runemployee;


public class PartTimeEmployee extends Employee {
    
    private double wage;
    private double rph;
    private int hour;
    
    public void setwage(double salary, double rph, int hour){
        this.rph = rph;
        this.hour = hour;
        this.wage = rph*hour;   
    }
    public double getwage(){
        return wage;
    }
}
