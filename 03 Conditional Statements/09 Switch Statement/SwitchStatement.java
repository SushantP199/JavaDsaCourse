import java.util.Scanner;

public class SwitchStatement {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Press button for desired item : ");
        int buttonNumber = scanner.nextInt();
        scanner.close();

        switch (buttonNumber){
            
            case 1 : System.out.println("Samosa");
                     break;
            case 2 : System.out.println("Burger");
                     break;
            case 3 : System.out.println("Mango Shake");
                     break;
            default : System.out.println("Button for desired item is not available");
        }
    }
}
