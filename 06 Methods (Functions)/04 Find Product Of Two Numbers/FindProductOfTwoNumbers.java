
public class FindProductOfTwoNumbers {

    public static int product(int a, int b) {
        int result = a * b;
        return result;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int product = product(a, b);
        System.out.println(a + " * " + b + " = " + product);
    }
}
