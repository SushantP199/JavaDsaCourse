/*
    Question 5 :
    Write a Java method to compute the sum of the digits in an integer.
    
    (Hint: Approach this question in the following way:
        a.Take a variable sum = 0
        b.Find the last digit of the number
        c.Add it to the sum
        d.Repeat b & c until the number becomes 0)
*/

import java.util.*;

public class ComputeSumOfTheDigitsInAnInteger {
    
    public static int sumOfDigitsInInteger(int integer) {

        int sum = 0;

        while (integer > 0) {

            int lastDigit = integer % 10;

            sum = sum + lastDigit;

            integer = integer / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        
        System.out.print("Enter an integer : ");
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        scanner.close();

        System.out.println("Sum of the digits in an integer " + integer + " : " + sumOfDigitsInInteger(integer));
    }
}
