/*
    Question 3 :
    Write a Java program to input week number (1-7) and 
    print day of week name using switch case.
*/

import java.util.*;;

public class DayOfWeekBasedOnInputWeekNumber {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Week Number (1-7) : ");
        byte weekNumber = scanner.nextByte();
        scanner.close();

        String weekDay = "";

        switch (weekNumber) {
            case 1: weekDay = "Sunday";
                    break;
            case 2: weekDay = "Monday";
                    break;
            case 3: weekDay = "Tuesday";
                    break;
            case 4: weekDay = "Wednesday";
                    break;
            case 5: weekDay = "Thursday";
                    break;
            case 6: weekDay = "Friday";
                    break;
            case 7: weekDay = "Saturday";
                    break;

            default: System.out.println("You have entered wrong week number. It should be between 1 to 7");
                return;
        }

        System.out.println("Week Day is " + weekDay);
    }
}
