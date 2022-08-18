import java.util.Scanner;

public class DisplayAllNumbersEnteredByUserExceptMultipleOf10 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a number : ");
            int number = scanner.nextInt();

            if (number % 10 == 0)
                continue;

            System.out.println(number);
        } while (true);

        // scanner.close(); -> add break condition | turn true to false by using some conditional sentence | simply ctrl + c while executing to exit the program
    }
}
