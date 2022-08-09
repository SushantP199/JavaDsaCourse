/*
    Question 1 : 
    In a program, input 3 numbers: A, B and C. 
    You have to output the average of these 3 numbers.
    (Hint : Average of N numbers is sum of those numbers divided by N)
*/

import java.util.*;

public class AverageOfThreeNumbers {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        float average = (a + b + c) / 3f;

        System.out.println(average);

        scanner.close();
    }
}
