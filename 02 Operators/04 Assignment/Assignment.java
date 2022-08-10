/*
    Precedence & Associativity of Operators
    hint : https://www.javatpoint.com/associativity-of-operators-in-java
*/
public class Assignment {

    public static void main(String[] args) {
        
        int a;

        System.out.println("Assignment a = " + (a = 10));

        a += 1;  // -> a = a + 1;
        System.out.println("a += 1 hence a = " + a);

        a -= 1;  // -> a = a - 1;
        System.out.println("a -= 1 hence a = " + a);
        
        a *= 2;  // -> a = a * 2;
        System.out.println("a *= 2 hence a = " + a);

        a /= 2;  // -> a = a / 2;
        System.out.println("a /= 2 hence a = " + a);

        a %= 3;  // -> a = a % 3;
        System.out.println("a %= 3 hence a = " + a);
    }
}