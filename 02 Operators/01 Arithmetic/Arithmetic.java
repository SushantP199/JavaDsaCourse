
public class Arithmetic {

    public static void main(String[] args) {
        
        // Binary 

        int a = 10;
        int b = 6;

        System.out.println("For Given        a = " + a + ", b = " + b);
        System.out.println("Addition         a + b = " + (a + b));
        System.out.println("Subtraction      a - b = " + (a - b));
        System.out.println("Multiplication   a * b = " + (a * b));
        System.out.println("Division         a / b = " + (1f * a / b ));
        System.out.println("Modulo           a % b = " + (a % b));


        // Unary

        System.out.println("Before Pre-increment       a = " + a);
        System.out.println("On Pre-increment       ++a a = " + (++a));
        System.out.println("After Pre-increment        a = " + a);

        System.out.println("Before Post-increment      a = " + a);
        System.out.println("On Post-increment      a++ a = " + (a++));
        System.out.println("After Post-increment       a = " + a);

        System.out.println("Before Pre-decrement       a = " + a);
        System.out.println("On Pre-decrement       --a a = " + (--a));
        System.out.println("After Pre-decrement        a = " + a);

        System.out.println("Before Post-decrement      a = " + a);
        System.out.println("On Post-decrement      a-- a = " + (a--));
        System.out.println("After Post-decrement       a = " + a);

        int x = 1;

        System.out.println("y = --x where x = " + x);
        
        int y = --x; // x++, x--, ++x 
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}