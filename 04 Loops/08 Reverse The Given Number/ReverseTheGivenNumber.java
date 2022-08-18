
public class ReverseTheGivenNumber {

    public static void main(String[] args) {
        int number = 10899;
        int reverseNumber = 0;

        System.out.print("Reverse of Number " + number + " : ");

        while (number > 0) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number /= 10; // -> number = number / 10;
        }

        System.out.println(reverseNumber);
    }

}
