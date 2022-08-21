
public class MethodOverloadingUsingDataTypes {

    // Method to calculate sum of two integer numbers
    public static int sum (int a, int b) {
        return a + b;
    }

    // Method to calculate sum of two float numbers
    public static float sum (float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 6));
        System.out.println(sum(3.5f, 6.45f));
    }
}
