/*
    Character Pattern :

    A
    BC
    DEF
    GHIJ
*/


public class CharacterPattern {
    
    public static void main(String[] args) {

        int maxLines = 6;
        char ch = 'A';

        /*
            here, is allowed ch = 'A' + 1; 
            is not allowed ch = ch + 1; (need explicit conversion)
        */
    
        for (int line = 1; line <= maxLines; line++) {
            
            for (int character = 1; character <= line; character++) {
                
                System.out.print(ch);
                ++ch;
            }

            System.out.println();
        }
    }
}
