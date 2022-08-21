import java.util.Scanner;

public class MethodWithParameters {
    
    /*
        Here in below function definition,
        operand1 & operand2 are termed as Parameters Or Formal Parameters.
    */
    public static int calculateSum(int operand1, int operand2){
        int sum = operand1 + operand2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the two numbers : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        /*
            Here in below function call,
            number1 & number2 are termed as Arguments Or Actual Parameters.
        */
        int sum = calculateSum(number1, number2);
        System.out.println(number1 + " + " + number2 + " = " + sum);
    }
}
