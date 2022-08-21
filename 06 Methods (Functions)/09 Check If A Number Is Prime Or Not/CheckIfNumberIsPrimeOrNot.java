
public class CheckIfNumberIsPrimeOrNot {
    
    // Regular Method
    // public static boolean isPrime (int number) {

    //     if (number <= 1)
    //         return false;
        
    //     boolean isPrime = true;

    //     for (int i = 2; i < number; i++) {
    //         if (number % 2 == 0) {
    //             isPrime = false;
    //             break;
    //         }
    //     }

    //     return isPrime;
    // }

    //Optimized Method
    public static boolean isPrime (int number) {

        /*
            Edge Case : (Just at extreme)
            Typically involves input value(s) that require special handling in an algorithm 
            behind a regular computer program
            i.e. for some kind of input(s) we need to write different code than regular one
            
            Corner Case : (Just at extreme for multiple inputs)
            Same as Edge Case, 
            But referred preferably more when there is a involvment of multiple input values aka variables

            Boundary Case : (Beyound extreme)
            A behavior of a system when one of its inputs Is At Or 
            Just Beyond Its Maximum Or Minimum Limits
            Ex. For example, if an input field is meant to accept only integer values 0–100, 
            then examples of boundary cases would be entering the values -1, 0, 100 and 101

            Base Case (Halting Case) : (Just at start or initial)
            (In maths) A lowest possible value, 
            (In recursion) Value after which recursion terminates 
            (as it is the case in a recursive definition in which the solution is obtained directl)

            https://www.educative.io/answers/corner-case-vs-edge-case

            edge cases:  occurs at extreme operating parameters
            corner cases: occurs at multiple operating parameters at extreme limits
            boundary cases: occurs at operating parameters are out of limits
            base cases: where recursion function returns
        */

        // Edge case
        if (number <= 1)
            return false;
        
        boolean isPrime = true;

        for (int i = 2; i <= Math.ceil(Math.sqrt(number)); i++) {
            if (number % 2 == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }
}
