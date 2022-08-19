import java.util.*;

public class FindFactorialOfAnyGivenNumber {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        scanner.close();

        int factorial = 1;

        for (int i = 0; i < number; ++i) {
            factorial *= (number - i);
        }

        /*
            int i = 0;
            while (i < number) {
                factorial *= (number - i);
                ++i;
            }
        */

        System.out.println("Factorial of " + number + "! = " + factorial);
    }
}
