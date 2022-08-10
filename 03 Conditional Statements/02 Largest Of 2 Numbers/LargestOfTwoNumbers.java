import java.util.*;

public class LargestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        // If Statement
        if (a == b) {
            System.out.println("Both the numbers " + a + " & " + b
                    + " are equal. Hence largest of two numbers is not making sense here");
            return;
        }

        // If Else (or just Else) Statement
        if (a > b) {
            System.out.println(a + " is the largest of two numbers " + a + " & " + b);
        } else {
            System.out.println(b + " is the largest of two numbers " + a + " & " + b);
        }

    }
}
