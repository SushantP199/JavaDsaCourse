import java.util.Scanner;

class CheckIfNumberIsPrimeOrNot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("""
            Prime Number Definition :

            Prime number n is number with exactly two integral divisors 1 & n
            AND
            Prime number n must be divisble by 1 & n
            AND
            Prime number ranges from +2 to positive infinity possibilities
            i.e. No positive divisors besides 1 and number itself (before 1 and after n)
            """);

        do {
            System.out.print("Enter a number : ");
            number = scanner.nextInt();

            if (number >= 0) {
                break;
            } else {
                System.out.println("As per defintion \nNumber " + number + " cannot be prime number");
            }

        } while (number < 0);
        scanner.close();

        if (number == 0) {
            System.out.println("As per defintion \nNumber " + number + " is not a prime number");
        } else if (number == 1) {
            System.out.println("As per defintion \nNumber " + number + " is not a prime number");
        } else if (number == 2) {
            System.out.println("As per defintion \nNumber " + number + " is a prime number");
        } else {
            boolean isPrime = true;

            // for (int i = 2; i <= number - 1; ++i) {  -> runs n-2 times
            // for (int i = 2; i <= number / 2 ; ++i) { -> runs n/2 times\
            // below for loop runs root n times
            for (int i = 2; i <= Math.ceil(Math.sqrt(number)) ; ++i) {  
                if (number % 2 == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }
}