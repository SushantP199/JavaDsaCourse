/*
    Solid Rhombus :

            * * * * *
          * * * * *
        * * * * *
      * * * * *
    * * * * *
*/

public class SolidRhombus {
    
    public static void printSolidRhombus(int totalRows) {

        for (int row = 1; row <= totalRows; row++) {

            for (int space = 1; space <= totalRows - row; space++) {
                System.out.print("  ");
            }

            for (int star = 1; star <= totalRows; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printSolidRhombus(5);
        printSolidRhombus(8);
    }
}
