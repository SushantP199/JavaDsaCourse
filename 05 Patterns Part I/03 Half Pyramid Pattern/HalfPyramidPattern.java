/*
    Half Pyramid Pattern :

    1
    12
    123
    1234
*/

public class HalfPyramidPattern {
    
    public static void main(String[] args) {

        int maxLines = 5; // same as int n = 5;
        
        for (int line = 1; line <= maxLines; line++) {
            
            for (int number = 1; number <= line; number++) {
                
                System.out.print(number);
            }

            System.out.println();
        }
    }
}
