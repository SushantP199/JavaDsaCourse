/*
    Inverted Half Pyramid : (With Numbers)

          *
        * *
      * * *
    * * * *
*/

public class InvertedRotatedHalfPyramid {
    
    public static void printInvertedRotatedHalfPyramid(int totalRows) {

        for (int row = 1; row <= totalRows; row++) {
            
            for (int space = 1; space <= totalRows - row; space++) {
                System.out.print("  ");
            }

            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printInvertedRotatedHalfPyramid(4);
        printInvertedRotatedHalfPyramid(6);
    }
}
