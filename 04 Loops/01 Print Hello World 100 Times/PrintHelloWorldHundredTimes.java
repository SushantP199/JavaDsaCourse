public class PrintHelloWorldHundredTimes {
    
    public static void main(String[] args) {
        
        int counter = 1;

        // We should avoid the value of condition becomes true everytime / every next time.
        while (counter <= 100) {

            System.out.println("Hello World");
            counter += 1;
        }

        System.out.println("Printed Hello World " + (counter - 1) + " Times");
    }
}
