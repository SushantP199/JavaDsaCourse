/*
    Question 1 :
    Write a Java program to get a number from the user and 
    print whether it is positive or negative.
*/

import java.util.*;

public class NumberIsPostiveOrNegative {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you number : ");
        short number = scanner.nextShort();
        scanner.close();

        if (number == 0){
            System.out.println("Number " + number + " is neither positive nor negative");
        } else if (number > 0) {
            System.out.println("Number " + number + " is positive");
        } else {
            System.out.println("Number " + number + " is negative");
        }

    }
}
