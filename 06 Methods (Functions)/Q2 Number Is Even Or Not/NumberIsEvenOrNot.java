/*
    Question2 :
    Write a method named isEven that accepts an int argument.
    The method should return true if the argument is even, or false otherwise.
    Also write a program to test your method.
*/
import java.util.*;

public class NumberIsEvenOrNot {
    
    public static boolean isEven (int number) {

        if (number % 2 == 0)
            return true;

        return false;
    }

    public static void main(String[] args) {
        
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        boolean isEven = isEven(number);

        if (isEven) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
