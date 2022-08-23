/*
    Inverted Half Pyramid : (With Numbers)

    1 2 3 4 5
    1 2 3 4 
    1 2 3 
    1 2 
    1 
*/

public class InvertedHalfPyramid {
    
    public static void printInvertedHalfPyramid(int totalRows) {

        for (int row = 1; row <= totalRows; row++) {
            
            for (int col = 1; col <= totalRows - row + 1; col++) {
                
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printInvertedHalfPyramid(5);
        printInvertedHalfPyramid(7);
    }
}
