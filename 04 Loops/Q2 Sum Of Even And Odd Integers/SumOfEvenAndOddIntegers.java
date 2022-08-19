/*
    Question 2 :
    Write a program that reads a set of integers, and then
    prints the sum of the even and odd integers.
*/

import java.util.*;

class SumOfEvenAndOddIntegers {

    public static void main(String[] args) {

        System.out.print("Enter the number for set of integers you want enter : ");
        Scanner scanner = new Scanner(System.in);
        int setOfIntegers = scanner.nextInt();

        int sumOfEvenIntegers = 0;
        int sumOfOddIntegers = 0;

        for (int integer = 1; integer <= setOfIntegers; ++integer) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                sumOfEvenIntegers += number;
            } else {
                sumOfOddIntegers += number;
            }
        }

        System.out.println("Sum of Even Integers : " + sumOfEvenIntegers);
        System.out.println("Sum of Odd Integers : " + sumOfOddIntegers);

        scanner.close();
    }
}

/*
 * Question 2 :
 * Write a program that reads a set of integers, and then
 * prints the sum of the even and odd integers.
 * 
 * 
 * import java.util.*;
 * 
 * class SumOfEvenAndOddIntegers {
 * 
 * public static void main(String[] args) {
 * 
 * int sumOfEvenIntegers = 0;
 * int sumOfOddIntegers = 0;
 * int choice;
 * 
 * do {
 * 
 * System.out.print("Enter the number : ");
 * Scanner scanner = new Scanner(System.in);
 * int number = scanner.nextInt();
 * 
 * if (number % 2 == 0) {
 * sumOfEvenIntegers += number;
 * } else {
 * sumOfOddIntegers += number;
 * }
 * 
 * System.out.
 * print("To Continue to enter number press 1 AND To Stop to enter number Press 0 : "
 * );
 * choice = scanner.nextInt();
 * 
 * } while (choice == 1);
 * 
 * System.out.println("Sum of Even Integers : " + sumOfEvenIntegers);
 * System.out.println("Sum of Odd Integers : " + sumOfOddIntegers);
 * 
 * }
 * }
 */
