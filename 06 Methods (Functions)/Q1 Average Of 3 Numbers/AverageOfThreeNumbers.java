/*
    Question 1 :
    Write a Java method to compute the average of three numbers.
*/

import java.util.*;

public class AverageOfThreeNumbers {
    
    public static float averageOfThreeNumbers (int number1, int number2, int number3) {

        return (number1 + number2 + number3) / 3f;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        scanner.close();

        float averageOfThreeNumbers = averageOfThreeNumbers(number1, number2, number3);
        System.out.println("Average of 3 numbers " + number1 + ", " + number2 + " & " + number3 + " = " + averageOfThreeNumbers);
    }
}
