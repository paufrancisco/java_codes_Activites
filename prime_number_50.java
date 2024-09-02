public class prime_number_50 {

    public static void main(String[] args) {
        // Loop through numbers from 1 to 50
        for (int num = 2; num <= 50; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Numbers less than 2 are not prime
        if (number < 2) {
            return false;
        }
        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
