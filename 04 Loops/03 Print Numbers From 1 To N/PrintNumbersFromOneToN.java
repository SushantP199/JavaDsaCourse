import java.util.Scanner;

public class PrintNumbersFromOneToN {
    
    public static void main(String[] args) {
        
        int counter = 1;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        while (counter <= n) {
            System.out.print(counter + " ");
            counter = counter + 1;
        }
    }
}
