/*
                                       n!
    Binomial Coefficient -> nCr = -------------
                                   r! (n - r)!
*/          

public class FindBinomialCoefficient {
    
    public static int factorial (int number) {
        
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
    
    public static float calculateBinomialCoefficient(int n, int r) {

        float binomialCoefficient = (float)factorial(n) / (factorial(r) * factorial(n-r));

        return binomialCoefficient;
    }

    public static void main(String[] args) {
        
        int n = 6;
        int r = 4;

        float nCr = calculateBinomialCoefficient(n, r);

        System.out.println("Binomial Coefficient " + n + " C " + r + " = " + nCr);
    }
}