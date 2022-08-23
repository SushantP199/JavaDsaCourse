/*
    Hollow Rhombus :

            * * * * *
          *       *
        *       *
      *       *
    * * * * *
*/

public class HollowRhombus {
    
    public static void printHollowRhombus(int totalRows) {

        for (int row = 1; row <= totalRows; row++) {
            
            for (int space = 1; space <= totalRows - row; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= totalRows; col++) {
                
                // rhombus is tilted square hence total columns is equal to toal rows
                if (row == 1 || col == 1 || col == totalRows || row == totalRows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printHollowRhombus(5);
        printHollowRhombus(10);
    }
}
