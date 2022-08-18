
public class DoWhileLoop {
    
    public static void main(String[] args) {
        
        int counter = 1;

        /* 
            Here do block execute once without any condition check 
            (this only differenatiate do while with while loop)
            & there after works like while loop only
        */
        do {
            System.out.println("Hello World");
            ++counter;
        } while (counter <= 10);
    }
}
