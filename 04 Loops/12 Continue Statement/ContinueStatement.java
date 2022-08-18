
public class ContinueStatement {
    
    public static void main(String[] args) {
        
        for (int i = 1; i < 7; ++i) {
            if ( i == 2 || i == 3) {
                System.out.println("I am continuing next iteration...");
                continue;
            }
            System.out.print(i);
            System.out.println("Executed block after continue...");
        }
    }
}