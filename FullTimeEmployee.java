

package runemployee;


public class FullTimeEmployee extends Employee  {
    
    private double salary;
    
    public void setsalary(double salary){
        this.salary = salary;
    }
    
    public double getsalary(){
            return salary;
    }
}
