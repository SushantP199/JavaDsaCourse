/*
    Diamond Pattern :

          * 
        * * *
      * * * * *
    * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
*/

public class DiamondPattern {
    
    public static void diamondLinePrinter (int row, int totalRows) {

        for (int space = 1; space <= totalRows - row; space++) {
            System.out.print("  ");
        }

        /*
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }

            for (int star = 1; star <= row - 1; star++) {
                System.out.print("* ");
            }
        */
        
        for (int star = 1; star <= (2 * row) - 1; star++) {
            System.out.print("* ");
        }

        System.out.println();
    }

    public static void printDiamondPattern (int totalRows) {

        // 1st half
        for (int row = 1; row <= totalRows; row++) {
            diamondLinePrinter(row, totalRows); 
        }

        // 2nd half
        for (int row = totalRows; row >= 1; row--) {
            diamondLinePrinter(row, totalRows);
        }
    }

    public static void main(String[] args) {
        // printDiamondPattern(4);
        printDiamondPattern(7);
    }
}
