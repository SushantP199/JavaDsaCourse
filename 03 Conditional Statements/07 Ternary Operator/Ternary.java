import java.util.Scanner;

public class Ternary {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();

        // Ternary operator
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);
    }
}
