/*
    Question 2 :
    In a program,input the side of a square.
    You have to output the area of the square.
    (Hint : area of a square is (side x side)) 
*/

import java.util.*;

public class AreaOfSquare {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float side = scanner.nextFloat();

        float areaOfSquare = side * side;

        System.out.println(areaOfSquare);

        scanner.close();
    }
}
