/*
    Hollow Rectangle : 

    * * * * *
    *       *
    *       *
    * * * * *
*/

class HollowRectangle {

    public static void printHelloRectangle(int totalRows, int totalColumns) {

        for (int row = 1; row <= totalRows; row++) {
            
            for (int col = 1; col <= totalColumns; col++) {
                
                if (row == 1 || col == 1 || col == totalColumns || row == totalRows) {

                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printHelloRectangle(4, 5);
        printHelloRectangle(7, 4);
    }
}