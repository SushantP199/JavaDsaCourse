
public class BinaryToDecimal {

    public static int binaryToDecimal(int binaryNumber) {

        int power = 0;
        int decimalNumber = 0;

        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10;

            decimalNumber = decimalNumber + (lastDigit * (int)Math.pow(2, power));

            binaryNumber = binaryNumber / 10;
            power = power + 1;
        }

        return decimalNumber;
    }

    public static void main(String[] args) {

        int binaryNumber = 10100011;

        System.out.println("Decimal Number Of Binary Number " + binaryNumber + " : " +binaryToDecimal(binaryNumber));
    }
}
