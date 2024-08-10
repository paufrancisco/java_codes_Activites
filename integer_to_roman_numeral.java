import java.util.InputMismatchException;
import java.util.Scanner;

public class integer_to_roman_numeral {

    // Method to convert an integer to a Roman numeral
    public static String intToRoman(int num) {
        // Declare Roman numeral symbols and corresponding values
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        // Convert the int number to Roman numeral
        String roman = thousands[num / 1000] +
                       hundreds[(num % 1000) / 100] +
                       tens[(num % 100) / 10] +
                       ones[num % 10];

        return roman; 
        // this return String 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number you want to convert to Roman numerals (1-3999):");
            int inputNumber = sc.nextInt();  
            
            // Input validation
            if (inputNumber < 1 || inputNumber > 3999) {
                System.out.println("Invalid input. Please enter a number between 1 and 3999.");
            } else {
                // Convert and display the Roman numeral
                String romanNumeral = intToRoman(inputNumber);
                System.out.println("Roman numeral: " + romanNumeral);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer number.");
        } finally {
            sc.close(); 
        }
    }
}
