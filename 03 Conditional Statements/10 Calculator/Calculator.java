import java.util.*;

public class Calculator {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you 1st operand : ");
        int operand1 = scanner.nextInt();

        System.out.print("Enter you 2nd operand : ");
        int operand2 = scanner.nextInt();

        System.out.print("Enter you operator ( + | - | * | / | % ) : ");
        char operator = scanner.next().charAt(0);

        scanner.close();

        float result = 0;

        switch (operator) {

            case '+' : result = operand1 + operand2;
                        break;
            case '-' : result = operand1 - operand2;
                        break;
            case '*' : result = operand1 * operand2;
                        break;
            case '/' : result = 1f * operand1 / operand2;
                        break;
            case '%' : result = operand1 % operand2;
                        break;
        }
        
        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }
}
