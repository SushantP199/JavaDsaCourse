
public class DecimalToBinary {
    
    public static int decimalToBinary (int decimalNumber) {

        int power = 0;
        int binaryNumber = 0;

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;

            binaryNumber += remainder * Math.pow(10, power);

            decimalNumber = decimalNumber / 2;
            power = power + 1;
        }

        return binaryNumber;
    }

    public static void main(String[] args) {

        int decimalNumber = 70;

        System.out.println(decimalToBinary(decimalNumber));
    }
}
