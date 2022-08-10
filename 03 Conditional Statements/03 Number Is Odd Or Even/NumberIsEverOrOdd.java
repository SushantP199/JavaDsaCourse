import java.util.*;

public class NumberIsEverOrOdd {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        scanner.close();

        if (number % 2 != 0) {
            System.out.println("Number " + number + " is odd");
        } else {
            System.out.println("Number " + number + " is even");
        }
    }
}
