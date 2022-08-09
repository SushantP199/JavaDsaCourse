// hint : https://www.javatpoint.com/type-casting-vs-type-conversion

public class TypeConversion {

    public static void main(String[] args) {

        /*
        
           Type Conversion is following
           1) Type Compatibility : Yes
           2) Destination Type > Source Type : Yes

        */
        int a = 25;
        long b = a;
        System.out.println(b);

        /*
            Type Conversion is following
            1) Type Compatibility : Yes
            2) Destination Type > Source Type : No -> Resulting in lossy conversion
        */
        // long x = 56;
        // int y = x;
        // System.out.println(y);
    }
}