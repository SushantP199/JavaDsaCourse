import java.util.*;

public class ProductWithInput {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int product = x * y;
        System.out.println(product);

        scanner.close();
    }
}
