import java.util.*;

public class KeepEnteringNumbersTillUserEntersMultipleOf10 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a number : ");
            int number = scanner.nextInt();

            if (number % 10 == 0)
                break;

            System.out.println(number);
        } while (true);

        scanner.close();
    }
}