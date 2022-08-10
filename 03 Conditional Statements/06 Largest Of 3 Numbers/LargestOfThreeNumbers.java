import java.util.*;

public class LargestOfThreeNumbers {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a > b && a > c) {
            System.err.println(a + " is the largest of 3 numbers " + a + ", " + b + " & " + c);
        } else if (b > c) {
            System.err.println(b + " is the largest of 3 numbers " + a + ", " + b + " & " + c);
        } else {
            System.err.println(c + " is the largest of 3 numbers " + a + ", " + b + " & " + c);
        }
    }
}
