import java.util.*;;

public class IncomeTaxCalculator {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int income = scanner.nextInt();
        scanner.close();

        float tax;

        if (income < 500000){
            tax = 0;
        } else if (income >= 500000 && income < 100000){
            tax = income * (20f / 100);
        } else {
            tax = income * (30f / 100);
        }

        System.out.println("Income Tax is " + tax);
    }
}
