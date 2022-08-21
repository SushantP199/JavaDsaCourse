/*
    Question 3 :
    Write a Java program to check if a number is a palindrome in Java ?
    (121 is a palindrome, 321 is not) 
    A number is called a palindrome if the number is equal to the reverse of a number
    e.g. 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand,
    321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.
*/

import java.util.*;

public class CheckIfNumberIsPalindromeOrNot {
    
    public static int reverseOfNumber (int number) {

        int reverse = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            reverse = (reverse * 10) + lastDigit;
            
            number = number / 10;
        }

        return reverse;
    }

    public static boolean isPalindrome (int number) {

        if (number == reverseOfNumber(number))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        // boolean isPalindrome = isPalindrome(number);

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number");
        }
        else {
            System.out.println(number + " is not a palindrome number");
        }
    }
}
