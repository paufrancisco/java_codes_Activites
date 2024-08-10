

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();
        sc.close();

        // Call the static isPalindrome method
        if (isPalindrome(number)) {
            System.out.println("Number is a palindrome: " + number);
        } else {
            System.out.println("Number is not a palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        String original = String.valueOf(number);
        String reversed = new StringBuilder(original).reverse().toString();

        // Check if the original string is equal to the reversed string
        return original.equals(reversed);
    }
}
