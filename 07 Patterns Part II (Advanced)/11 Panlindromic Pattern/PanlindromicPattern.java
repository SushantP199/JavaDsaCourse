/*
    Panlindromic Pattern :

            1 
          2 1 2 
        3 2 1 2 3 
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
*/

public class PanlindromicPattern {
    
    public static void printPanlindromicPattern (int totalRows) {

        for (int row = 1; row <= totalRows; row++) {
            
            for (int space = 1; space <= totalRows - row; space++) {
                System.out.print("  ");
            }

            for (int data = row; data >= 1 ; data--) {
                System.out.print(data + " ");
            }

            for (int data = 2; data <= row; data++) {
                System.out.print(data + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printPanlindromicPattern(5);
        printPanlindromicPattern(7);
    }
}
