import java.util.*;

public class AreaOfCircle {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float radius = scanner.nextFloat();

        float areaOfCircle = 3.14f * radius * radius;
        
        System.out.println(areaOfCircle);

        scanner.close();
    }
}
