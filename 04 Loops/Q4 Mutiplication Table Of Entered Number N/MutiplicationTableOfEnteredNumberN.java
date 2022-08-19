import java.util.*;

public class MutiplicationTableOfEnteredNumberN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        int currentValueOftable = 0;
        int maximumValueOfTable = number * 10;

        while (currentValueOftable < maximumValueOfTable) {
            currentValueOftable += number;
            System.out.println(currentValueOftable);
        }

        /*
            for (int i = 1; currentValueOftable < maximumValueOfTable; i++) {
                currentValueOftable += number;
                System.out.println(number + " x " + i + " = " + currentValueOftable);
            }
        */
        
        /*
            Question 5 Small Checkout

            for (int i = 0; i <= 5; i++) {
                System.out.println("i = " + i);
            }

            System.out.println("i after the loop = " + i); 
            This line no 34 produce compile time error (javac ..... on console) as int i variable of for loop limited till scope of for loop in between { } & for above line i variable is not resolved (not declared & used) error will come
        */
        
    }
}
