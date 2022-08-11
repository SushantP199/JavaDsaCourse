/*
    Question 5 :
    Write a Java program that takes a year from the user and
    print whether that year is a leap year or not.
*/

import java.util.*;

public class YearIsLeapYearOrNot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter valid year : ");
        short year = scanner.nextShort();
        scanner.close();

        /*
        
        boolean isLeapYearCondition1 = year % 4 == 0 && year % 100 != 0;
        boolean isLeapYearCondition2 = year % 4 == 0 && year % 100 == 0 && year % 400 == 0;

        if (isLeapYearCondition1 || isLeapYearCondition2) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        
        */

        // Simplified logic based time line analysis o notes

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
