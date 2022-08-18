
public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 5; ++i) {
            if (i == 3) {
                System.out.println("At i = " + i + " I am breaking out of for loop...");
                break;
            }
            System.out.println(i);
        }

        System.out.println("I am breaked out of for loop");
    }
}
