/*
    0-1 Triangle : 

    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
*/

public class ZeroOneTriangle {
    
    public static void printZeroOneTriangle(int totalRows) {

        for (int row = 1; row <= totalRows; row++) {
            
            for (int col = 1; col <= row; col++) {
                
                if ((row + col) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printZeroOneTriangle(5);
        printZeroOneTriangle(7);
    }
}

/*
Scratch Alternative
    
public static void printZeroOneTriangle(int totalRows) {

    for (int row = 1; row <= totalRows; row++) {

        int headStart;

        if (row % 2 == 0) {
            headStart = 0;
        } else {
            headStart = 1;
        }
        
        for (int col = 1; col <= row; col++) {

            System.out.print(headStart + " ");

            headStart = (headStart == 0) ? 1 : 0;
        }

        System.out.println();
    }
}
*/