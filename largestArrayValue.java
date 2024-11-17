public class largestArrayValue {
    public static void main(String[] args) {
        
        int number [] = {6,2,3,7,5};
        
        // assuming that the first element is the largest
        int largest = number[0];
        

        for (int i = 1; i < number.length; i++) {
            
            if( number[i] > largest){

                largest = number[i];
                
            }
        }
        System.out.println("The largest number: "+ largest);
    }
}






