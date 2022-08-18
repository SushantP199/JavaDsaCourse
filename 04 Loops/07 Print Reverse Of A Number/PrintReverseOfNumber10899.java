
public class PrintReverseOfNumber10899 {
    
    public static void main(String[] args) {
        
        int number = 10899;

        // avoid while (number / 10 != 0) or while (number != 0)
        while (number > 0) { 
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number = number / 10;
        }
    }
}
