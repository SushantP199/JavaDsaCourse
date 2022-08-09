public class TypePromotion {
    
    public static void main(String[] args) {
        
        // Ex.1
        char m = 'm';
        char n = 'n';
        System.out.println(m-n);
        /*
            in expression m-n 
            char m & n promoted to int having number values 109 & 110 respectively
            & finally int type result -1 returned i.e. evaluated or assigned back
        */
        System.out.println(m);
        /*
            above lines simple prints value (') m (') on console as 
            variable m inside println is not in expression 
            hence not promoted to int
        */


        // Ex.2
        short s = 5;
        byte t = 25;
        char u = 'u';

        /*
            byte v = s + t + u;

            operands s, t & u of respective types are 
            promoted to int and final result of int type
            cannot be returned or assigned variable v of byte type
        */

        byte v = (byte) (s + t + u);

        System.out.println(v);
        /* 
            result value v = -109 won't make any sense as data lossed 
            while type casting int result 147 to byte result which is -109
        */


        // Ex.3
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;

        double answer = a + b + c + d;
        /*
            int answer = a + b + c + d; 
            produce error lossy conversion from double (indicates all 
            operands i.e. type of operands promoted to double) to int
        */

        System.out.println(answer);


        // Ex.4
        byte x = 5;

        /*
            x = x * 2;
            produce error lossy conversion from int (indicates all 
            operands i.e. type of operands promoted to int) to byte
        */

        x = (byte) (x * 2);
        System.out.println(x);
        
    }
}
