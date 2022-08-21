
public class CallByValue {

    public static void swap(int a, int b) {
        int temporary = a;
        a = b;
        b = temporary;
        System.out.println("swap() a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        swap(a, b);
        System.out.println("main() a = " + a + ", b = " + b);
    }
}
