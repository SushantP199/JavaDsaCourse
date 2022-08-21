
public class MethodOverloadingUsingParameters {

    // Method (aka function loosely in class) to calculate sum of two numbers
    public static int sum (int a, int b) {
        return a + b;
    }

    // Method to calculate sum of three numbers
    public static int sum (int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(2, 6));
        System.out.println(sum(2, 6, 5));
    }
}
