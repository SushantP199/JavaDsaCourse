import java.util.Scanner;

public class SumOfFirstN_NaturalNumbers {
    
    public static void main(String[] args) {
        
        int naturalNumber = 1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number N : ");
        int n = scanner.nextInt();
        scanner.close();

        while (naturalNumber <= n) {
            sum = sum + naturalNumber;
            ++naturalNumber; // simply do naturalNumber = naturalNumber + 1
        }

        System.out.println("Sum Of First " + n + " Natural Number Is " + sum);

    }
}
