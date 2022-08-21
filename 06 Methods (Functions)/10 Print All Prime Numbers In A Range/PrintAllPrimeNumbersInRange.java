
public class PrintAllPrimeNumbersInRange {
    
    public static boolean isPrime (int number) {

        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public static void printPrimesInRange(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printPrimesInRange(100, 1000);
    }
}
