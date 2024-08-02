
package labexer_prefinal;


    enum Color{RED,LIGHTRED,BLUE,LIGHTBLUE,YELLOW,LIGHTYELLOW};
    
    enum Model{SEDAN, SUV, CONVERTIBLE, HATCHBACK};
    

    class Car{
        
         private int year;
         private Model model;
         private Color color;
       
    
    public Car(int yr, Model model, Color color){
        this.year = yr;
        this.model = model;
        this.color = color;
        
    }
    
    public void display(){
        System.out.println("The car is "+year+" "+ color+" "+model);
        }
    }

    public class Labexer_prefinal { 
        
    public static void main(String[] args) {
        
        Car car1 = new Car(2014, Model.SUV, Color.RED);
        Car car2 = new Car(2016,Model.SEDAN,Color.RED);
        car1.display();
        car2.display();
    }
}
