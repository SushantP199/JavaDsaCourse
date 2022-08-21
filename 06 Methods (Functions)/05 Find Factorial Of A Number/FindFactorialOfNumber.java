
public class FindFactorialOfNumber {
    
    public static int factorial (int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        
        int number = 4;

        System.out.println("Factorial of number "  + number + "! = " + factorial(number));
    }
}
