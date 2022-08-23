/*
    Butterfly Pattern :

    *             *
    * *         * *
    * * *     * * *
    * * * * * * * *
    * * * * * * * *
    * * *     * * *
    * *         * *
    *             *
*/

public class ButterflyPattern {

    public static void butterflyLinePrinter(int row, int totalRows) {

        for (int star = 1; star <= row ; star++) {
            System.out.print("* ");
        }

        for (int space = 1; space <= 2 *(totalRows - row); space++) {
            System.out.print("  ");
        }

        for (int star = 1; star <= row; star++) {
            System.out.print("* ");
        }

        System.out.println();
    }
    
    public static void printButterflyPattern(int totalRows) {

        // 1st half
        for (int row = 1; row <= totalRows; row++) {
            butterflyLinePrinter(row, totalRows);
        }

        // 2nd half
        for (int row = totalRows; row >= 1; row--) {
            butterflyLinePrinter(row, totalRows);
        }
    }

    public static void main(String[] args) {
        // printButterflyPattern(4);
        printButterflyPattern(8);
    }
}
