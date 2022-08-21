
public class MathClassBuiltInMethods {

    public static void main(String[] args) {
        
        System.out.println("Math.min(12, 7) = " + Math.min(12, 7));
        System.out.println("Math.max(12, 7) = " + Math.max(12, 7));
        System.out.println("Math.sqrt(13) = " + Math.sqrt(13));
        System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3));
        System.out.println("Math.abs(-8732.154) = " + Math.abs(-8732.154));

        /*
            If the argument is of int or long type: 
            If the argument is equal to the value of Integer.MIN_VALUE or Long.MIN_VALUE, 
            the most negative representable int or long value, the result is that same value, 
            which is negative.
        */
        System.out.println("Math.abs(-2147483648 ) = " + Math.abs(-2147483648 ));
        // System.out.println("Math.absExact(-2147483648) = " + Math.absExact(-2147483648));
        System.out.println("Math.absExact(-2147483648l) = " + Math.absExact(-2147483648l)); // appending l represent long
        System.out.println("Math.absExact(-18885785959l) = " + Math.absExact(-18885785959l));
        /*
            int minimum value => -2147483648
            int maximum value => 2147483647

            absolute of minimum value -2147483648 will be 2147483648

            & 2147483648 is overflow maximum value 2147483647

            hence, abs() returns -2147483648, where absExact() return error
        */
    }
}