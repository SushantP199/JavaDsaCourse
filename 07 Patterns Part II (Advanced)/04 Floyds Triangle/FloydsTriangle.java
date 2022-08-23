/*
    FLOYD'S Triangle :
    
    1
    2  3
    4  5  6
    7  8  9  10
    11 12 13 14 15
*/
public class FloydsTriangle {
    
    public static void printFloydsTriangle(int totalRows) {

        int number =  1;

        for (int row = 1; row <= totalRows; row++) {
            
            for (int col = 1; col <= row; col++) {
                
                System.out.print(number + " ");

                if (number < 10) {
                    System.out.print(" ");
                } 
                ++number;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printFloydsTriangle(5);
        printFloydsTriangle(8);
    }
}
