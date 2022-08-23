/* 
    Number Pyramid :

            1
          2   2
        3   3   3
      4   4   4   4
    5   5   5   5   5
*/

public class NumberPyramid {
    
    public static void printNumberPyramid (int totalRows) {

        for (int row = 1; row <= totalRows; row++) {
            
            for (int space = 1; space <= totalRows - row; space++) {
                System.out.print("  ");
            }

            for (int data = 1; data <= row; data++) {
                System.out.print(row + "   ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printNumberPyramid(5);
        printNumberPyramid(7);
    }
}
