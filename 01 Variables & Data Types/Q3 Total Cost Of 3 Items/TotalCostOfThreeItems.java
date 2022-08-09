/*
    Question 3 :
    Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. 
    You have to output the total cost of the items back to the user as their bill.
    (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
*/

import java.util.Scanner;

public class TotalCostOfThreeItems {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int pencilCost = scanner.nextInt();
        int penCost = scanner.nextInt();
        int eraserCost = scanner.nextInt();

        int totalCostOfThreeItems = pencilCost + penCost + eraserCost;

        // % = 1/100 hence 18% = 18/100
        float gstOnTotalCostOfThreeItems = 18f/100 * totalCostOfThreeItems; 

        float totalCostWithGST = totalCostOfThreeItems + gstOnTotalCostOfThreeItems;

        System.out.println(totalCostWithGST);

        scanner.close();
    }
}